package com.niit.PankajSirBackEnd;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.PankajSirBackEnd.dao.ProductDAO;
import com.niit.PankajSirBackEnd.model.Product;

public class ProductTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Product product;
	
	@Autowired
	static ProductDAO productDAO;
	
	@BeforeClass
	
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.PankajSirBackEnd");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
		product = (Product) context.getBean("product");
 	}
	
	@Test
		public void testInsertProduct()
		{
			System.out.println("Inside Inserting Product");
			product.setId("00100");
			product.setName("Dell Inspiron");
			product.setPrice("35000");
			product.setDisc("2.2 Ghz Fifth Generation");
			product.setQuantity("10");
			boolean check=productDAO.addProduct(product);
			assertEquals("User Register",true,check);
			
		}
}
