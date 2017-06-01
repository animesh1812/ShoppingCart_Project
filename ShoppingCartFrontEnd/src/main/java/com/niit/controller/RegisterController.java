package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.PankajSirBackEnd.dao.RegisterDAO;
import com.niit.PankajSirBackEnd.model.Register;

@Controller
public class RegisterController {

	@Autowired
	RegisterDAO registerdao;
	@Autowired
	Register register;

	@RequestMapping("/saveRegistration")
	public ModelAndView register(@ModelAttribute("Register") Register register) {
		
		/*register.setId(id);
		register.setFirstName(firstName);
		register.setLastName(lastName);
		register.setPassword(password);
		register.setEmail(email);*/
		ModelAndView mv = new ModelAndView("/Home");
		registerdao.save(register);
			
		return mv;

	}

}
