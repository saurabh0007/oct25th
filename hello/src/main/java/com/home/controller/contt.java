package com.home.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.home.model.type;
import com.home.service.typeservice;

public class contt
{
 
	@Autowired
	typeservice ts;
		 

	@RequestMapping("/bloodtype")
	public ModelAndView bloodtype()
	{
		ModelAndView mav = new ModelAndView("bloodtype");
		
		mav.addObject("type", new type());
		
		return mav;
	}
	
	@RequestMapping("/AddUserToDB2")
	public ModelAndView AddUserToDB( @Valid @ModelAttribute("type")type t , BindingResult bi )
	{
		ModelAndView mav = new ModelAndView("bloodtype");
		
		if( bi.hasErrors() )
			mav.addObject("type", t);
		else
		{
			if( !t.getBLOODUNIT().equals(t.getBLOODUNIT()) )
			{
				mav.addObject("error", "BLOODUNIT Mismatch");
				mav.addObject("type", t);
			}
			else
			{
				List<type> list = ts.listtype();
				
				boolean check = false;
				
				for( type ul : list )
				{
					if( ul.getBLOODGROUPID().equals(t.getBLOODGROUPID()) )
					{
						check = true;
						break;
					}
				}
				
				if( check )
				{
					mav.addObject("error", "Username Already Exists");
					mav.addObject("type", t);
				}
				else
				{
				ts.addType(t);
					mav.addObject("success", "User Added Succesfully");
					mav.addObject("type", new type());
				}
			}
		}
			
		return mav;
	}

		  



	
	
	
}
