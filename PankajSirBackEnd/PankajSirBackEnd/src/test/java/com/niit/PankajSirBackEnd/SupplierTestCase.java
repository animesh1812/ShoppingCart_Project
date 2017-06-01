/*package com.niit.PankajSirBackEnd;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.PankajSirBackEnd.dao.SupplierDAO;
import com.niit.PankajSirBackEnd.model.Supplier;

public class SupplierTestCase {

		@Autowired
		static AnnotationConfigApplicationContext context;
		
		@Autowired
		static Supplier supplier;
		
		@Autowired
		static SupplierDAO supplierDAO;
		
		@BeforeClass
		public static void init()
		{
			context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.PankajSirBackEnd");
			context.refresh();
			supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
			supplier =  (Supplier) context.getBean("supplier");
			
		}
		
		//@Test
		public void testInsertSupplier()
		{
			supplier.setId("003");
			supplier.setName("Kolkata Knight Riders");
			supplier.setAddress("Kolkata");
			System.out.println("Inside test");
			boolean check = supplierDAO.save(supplier);
			assertEquals("supplier test case",true,check);
		}
	
		//@Test
		public void testUpdateSupplier()
		{
			supplier.setId("001");
			supplier.setName("Royal Challengers Bangalore");
			supplier.setAddress("Bangalore");
			System.out.println("Updating Users");
			boolean check = supplierDAO.update(supplier);
			assertEquals("update supplier",true, check);
		}
		
		@Test
		public void testDeletesupplier()
		{
			supplier.setId("001");
			System.out.println("Deleting User");
			boolean check = supplierDAO.delete(supplier);
			assertEquals("Deleting Supplier",true,check);
		}
		
		
}
*/