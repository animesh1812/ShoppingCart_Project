package com.niit.PankajSirBackEnd;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.PankajSirBackEnd.dao.RegisterDAO;
import com.niit.PankajSirBackEnd.model.Register;

public class RegisterTestCase {

@Autowired
	static AnnotationConfigApplicationContext context;
@Autowired
	static Register register;
@Autowired
	static RegisterDAO registerDAO;

@BeforeClass
	
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.PankajSirBackEnd");
		context.refresh();
		registerDAO = (RegisterDAO) context.getBean("registerDAO");
		register = (Register) context.getBean("register");
	}

//@Test
	public void testInsertUser()
	{
		register.setId("mohan_arushi11");	
		register.setFirstName("Arushi");
		register.setLastName("Jodaro");
		register.setEmail("mohan.arushi11@gmail.com");
		register.setPassword("qwerty1234");
		System.out.println("User Registered");
		boolean check = registerDAO.save(register);
		assertEquals("User Register",true,check);
	}

//@Test
	public void testUpdateUser()
	{
	register.setId("mohan_arushi11");
	register.setFirstName("Arushi");
	register.setLastName("Mohan");
	register.setEmail("mohan.arushi11@gmail.com");
	register.setPassword("qwerty1234");
	System.out.println("User Updated");
	boolean check= registerDAO.update(register);
	assertEquals("User Updated",true,check);
	}
	
@Test
	public void testList()
	{
		int actsize = registerDAO.list().size();
		assertEquals(4,actsize);
	}
}
