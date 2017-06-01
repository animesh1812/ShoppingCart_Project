package com.niit.PankajSirBackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.niit.PankajSirBackEnd.dao.UserDAO;
import com.niit.PankajSirBackEnd.model.User;

public class UserTestCase {
	
	
		@Autowired 
		static AnnotationConfigApplicationContext context;
		@Autowired 
		static User user;
		@Autowired 
		static  UserDAO userdao;
		
		@BeforeClass
		public static void init(){
			
			context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.PankajSirBackEnd");
			context.refresh();
			userdao = (UserDAO)context.getBean("userDAO");
			user = (User)context.getBean("user");
		}
		
		/*@Test
		public void testInsertUser(){
		user.setId("010");
		user.setName("Sachin Tendulkar");
		user.setPassword("sachin_rt");
		user.setRole("Batsman");
		System.out.println("Inside Test");
		boolean check = userdao.save(user);
		assertEquals("insert user", true,check);
}*/
		
		@Test
		public void testUpdateUser(){
		user.setId("112");
		user.setName("MS Dhoni");
		user.setPassword("dhoni");
		user.setRole("user");
		boolean check = userdao.update(user);
		assertEquals("category", true,check);
}
		
		/*@Test
		public void testDeleteUser(){
		user.setId("111");
		boolean check = userdao.delete(user);
		assertEquals("Delete user", true,check);
}
		@Test
		public void testListUser()
		{
			int actSize = userdao.list().size();
			assertEquals(3,actSize);
		}
		@Test
		public void testUserValidate(){
			
		}
*/				
}

