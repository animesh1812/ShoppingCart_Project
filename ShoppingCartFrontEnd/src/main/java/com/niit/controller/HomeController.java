package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
	@Autowired
	HttpSession session;
	
	@RequestMapping("/")
	public ModelAndView goToHome(){
		ModelAndView mv = new ModelAndView("/Home");
		return mv;
	}
	@RequestMapping("/AdminHome")
	public ModelAndView adminControlCategory()
	{
		ModelAndView mv = new ModelAndView("/admin/AdminHome");
		return mv;
	}
	
	@RequestMapping("/AdminHome")
	public ModelAndView adminControlSupplier()
	{
		ModelAndView mv = new ModelAndView("/admin/AdminHome");
		return mv;
	}
	
	
	@RequestMapping("/Login")
	public String loginPage(Model model)
	{
		model.addAttribute("isUserClickLogin", true);
		return "Login";
		
	}
	
	@RequestMapping("/Register")
	
		public ModelAndView registerPage(Model model)
		{
			ModelAndView mv = new ModelAndView("/Register");
			model.addAttribute("isUserClickRegistration", true);
			System.out.println("USer click registration link");
			return mv;
		}
	
	@RequestMapping("/Logout")
	public ModelAndView logout()
	{
		ModelAndView mv =new ModelAndView("/Home");
		session.removeAttribute("message");
		return mv;
	}
	}

