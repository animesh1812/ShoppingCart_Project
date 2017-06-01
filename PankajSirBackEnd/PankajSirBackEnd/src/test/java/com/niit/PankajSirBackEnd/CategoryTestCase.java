package com.niit.PankajSirBackEnd;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.PankajSirBackEnd.dao.CategoryDAO;
import com.niit.PankajSirBackEnd.model.Category;

public class CategoryTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Category categories;

	@Autowired
	static CategoryDAO categorydao;
	
	@BeforeClass
	public static void init(){
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.PankajSirBackEnd");
		context.refresh();
		categorydao = (CategoryDAO)context.getBean("categoryDAO");
		categories = (Category)context.getBean("category");
	}
	@Test
	public void testInsertCategory()
	{
		categories.setId("112");
		categories.setName("Iphone 7s");
		categories.setDescription("Electronic Item");
		System.out.println("inside test");
		boolean check = categorydao.save(categories);
		assertEquals("insert category", true,check);
		System.out.println("Value Inserted");
	}
//	@Test
	public void testDeleteUser(){
	categories.setId("111");
	boolean check = categorydao.delete(categories);
	assertEquals("bahubali", true,check);
}
	//@Test
	public void testListUser()
	{
		int actSize = categorydao.list().size();
		assertEquals(3,actSize);
	}
//	@Test
	public void testUserValidate(){
		
	}
}
