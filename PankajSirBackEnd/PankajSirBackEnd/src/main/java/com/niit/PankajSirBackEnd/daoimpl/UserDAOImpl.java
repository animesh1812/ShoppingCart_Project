package com.niit.PankajSirBackEnd.daoimpl;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.PankajSirBackEnd.dao.UserDAO;
import com.niit.PankajSirBackEnd.model.User;


@Transactional
@Repository(value="userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	public boolean save(User users) {
		try {
			sessionFactory.getCurrentSession().save(users);
			return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean update(User users) {
		try {
			sessionFactory.getCurrentSession().update(users);
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		return true;
	}


	public boolean delete(User users) {
		try {
			sessionFactory.getCurrentSession().update(users);
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<User> list(){
	return 	sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	public User get(String id) {
		
			 return sessionFactory.getCurrentSession().get(User.class, id);
			}

	public boolean validate(String id, String password) {
	Query query = sessionFactory.getCurrentSession().createQuery("from User where id=? and password=?");
	query.setString(0, id);
	query.setString(1, password);
	if(query.uniqueResult()== null)
	{
		return false;	
	}
	else
	{
		return true;
	}
	
	}

	
}
