package com.home.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ModelAndViewMethodReturnValueHandler;

import com.home.model.Requirement;

import com.home.service.Requirementservice;



@Controller
public class requirement {

	@Autowired
	Requirementservice rs;
		 

	@RequestMapping("/Requirement")
	public ModelAndView signup()
	{
		ModelAndView mav = new ModelAndView("Requirement");
		
		mav.addObject("Requirement", new Requirement());
		
		return mav;
	}
	
	@RequestMapping("/AddUserToDB2")
	public ModelAndView AddUserToDB( @Valid @ModelAttribute("Requirement")Requirement r , BindingResult bi )
	{
		ModelAndView mav = new ModelAndView("signup");
		
		if( bi.hasErrors() )
			mav.addObject("Requirement", r);
		else
		{
			if( !r.getDateOfRequirement().equals(r.getDateOfRequirement()) )
			{
				mav.addObject("error", "Requirement Mismatch");
				mav.addObject("Requirement", r);
			}
			else
			{
				List<Requirement> list = rs.listRequirement();
				
				boolean check = false;
				
				for( Requirement ul : list )
				{
					if( ul.getRequestercontactNumber().equals(r.getRequestercontactNumber()) )
					{
						check = true;
						break;
					}
				}
				
				if( check )
				{
					mav.addObject("error", "Username Already Exists");
					mav.addObject("Requirement", r);
				}
				else
				{
				rs.addRequirement(r);
					mav.addObject("success", "User Added Succesfully");
					mav.addObject("Requirement", new Requirement());
				}
			}
		}
			
		return mav;
	}

		  

}
