package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.PankajSirBackEnd.dao.CategoryDAO;
import com.niit.PankajSirBackEnd.dao.ProductDAO;
import com.niit.PankajSirBackEnd.dao.SupplierDAO;
import com.niit.PankajSirBackEnd.model.Category;
import com.niit.PankajSirBackEnd.model.Product;
import com.niit.PankajSirBackEnd.model.Supplier;


@Controller
public class AdminHomeController {
	@Autowired HttpSession session;
	@Autowired Category category;
	@Autowired Supplier supplier;
	@Autowired Product product;
	@Autowired CategoryDAO categoryDAO;
	@Autowired SupplierDAO supplierDAO;
	@Autowired ProductDAO productDAO;
	
@RequestMapping("/Category")
	public ModelAndView manageCategory()
	{
		ModelAndView mv = new ModelAndView("/admin/Category");
		mv.addObject("isAdminClickCategory",true);
		mv.addObject("isAdmin",true);
		List<Category> categoryList = categoryDAO.list();
		session.setAttribute("categoryList",categoryList);
		session.setAttribute("category", "category");
		return mv;
	}

@RequestMapping("/Supplier")
	public ModelAndView manageSupplier()
	{
	ModelAndView mv = new ModelAndView("/admin/Supplier");
	mv.addObject("isAdminClickSupplier", true);
	mv.addObject("isAdmin", true);
	List<Supplier> supplierList = supplierDAO.list();
	session.setAttribute("supplierList", supplierList);
	session.setAttribute("supplier", "supplier");
	return mv;
	}
	
}

