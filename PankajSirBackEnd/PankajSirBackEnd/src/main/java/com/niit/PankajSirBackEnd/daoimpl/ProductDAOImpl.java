package com.niit.PankajSirBackEnd.daoimpl;

import java.util.List;

//import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.PankajSirBackEnd.dao.ProductDAO;
import com.niit.PankajSirBackEnd.model.*;

@Repository(value="productDAO")
@EnableTransactionManagement
@Transactional
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addProduct(Product p){
		try {
			sessionFactory.getCurrentSession().save(p);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean editProduct(Product product){
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public boolean deleteProduct(Product product){
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public boolean getProductById(String id){
		try {
			 sessionFactory.getCurrentSession().get(Product.class, id);
			 return true;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
				
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts(){
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	
}