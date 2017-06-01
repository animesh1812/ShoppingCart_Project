package com.niit.PankajSirBackEnd.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.PankajSirBackEnd.dao.CategoryDAO;
import com.niit.PankajSirBackEnd.model.Category;

@EnableTransactionManagement
@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO{

	@Autowired
	private SessionFactory sessionFactory;
	public boolean save(Category categories) {
		
		try {
			sessionFactory.getCurrentSession().save(categories);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean update(Category categories) {
		try {
			sessionFactory.getCurrentSession().update(categories);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean delete(Category categories) {
		
		try {
			sessionFactory.getCurrentSession().delete(categories);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public Category getById(String Id) {
		try {
			sessionFactory.getCurrentSession().get(Category.class, Id);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Category getByName(String Name) {
	try {
		sessionFactory.getCurrentSession().get(Category.class, Name);
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}

	public List<Category> list() {
		sessionFactory.getCurrentSession().createQuery("from Category").list();
		return null;
	}

	
	

}
