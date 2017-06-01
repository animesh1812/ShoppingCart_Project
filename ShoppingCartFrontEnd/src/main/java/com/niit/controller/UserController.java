 package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.PankajSirBackEnd.dao.UserDAO;
import com.niit.PankajSirBackEnd.model.User;

@Controller
public class UserController {

@Autowired 
UserDAO userdao;
@Autowired 
User user;
@RequestMapping("/validate")

public ModelAndView login(@RequestParam("id")String id, @RequestParam("password")String password)
{
	System.out.println("SignUp here");
	ModelAndView mv = new ModelAndView("/Home");
	if(userdao.validate(id, password)==true)
	{
		user= userdao.get(id);
		mv.addObject("message","Welcome "+user.getName());}
		else
		{
			mv.addObject("isAdmin",true);
			
			
		}
	return mv;
	}
	
}
