package com.home.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.home.service.Donorservice;
import com.home.model.Donor;
@Controller
public class nor {

	@Autowired
	Donorservice ds;
		 

	@RequestMapping("/Donor")
	public ModelAndView Donor()
	{
		ModelAndView mav = new ModelAndView("Donor");
		
		mav.addObject("Donor", new Donor());
		
		return mav;
	}
	
	@RequestMapping("/AddUserToDB1")
	public ModelAndView AddUserToDB( @Valid @ModelAttribute("Donor")Donor D , BindingResult bi )
	{
		ModelAndView mav = new ModelAndView("Donor");
		
		if( bi.hasErrors() )
			mav.addObject("Donor",D );
		else
		{
			if( !D.getDonorName().equals(D.getDonorName()) )
			{
				mav.addObject("error", "DonorName Mismatch");
				mav.addObject("Donor", D);
			}
			else
			{
				List<com.home.model.Donor> list = ds.listDonor();
				
				boolean check = false;
				
				for( com.home.model.Donor ul : list )
				{
					if( ul.getEmailID().equals(D.getEmailID()) )
					{
						check = true;
						break;
					}
				}
				
				if( check )
				{
					mav.addObject("error", "Username Already Exists");
					mav.addObject("Donor", D);
				}
				else
				{
				ds.addDonor(D);
					mav.addObject("success", "User Added Succesfully");
					mav.addObject("Donor", new Donor());
				}
			}
		}
			
		return mav;
	}

	

  





}
