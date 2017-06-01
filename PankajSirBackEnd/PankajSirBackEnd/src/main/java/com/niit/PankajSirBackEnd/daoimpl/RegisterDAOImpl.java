package com.niit.PankajSirBackEnd.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.PankajSirBackEnd.dao.RegisterDAO;
import com.niit.PankajSirBackEnd.model.Register;


@Transactional
@Repository(value="registerDAO")
@EnableTransactionManagement
public class RegisterDAOImpl implements RegisterDAO{
	@Autowired
	
	private SessionFactory sessionFactory;

	public boolean save(Register register) {
		try {
			sessionFactory.getCurrentSession().save(register);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean update(Register register) {
		try {
			sessionFactory.getCurrentSession().update(register);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public Register get(String id) {
		sessionFactory.getCurrentSession().get(Register.class, id);
		return null;
	}

	public List<Register> list() {
		
		return sessionFactory.getCurrentSession().createQuery("from Sign_Up").list();
	}

}
