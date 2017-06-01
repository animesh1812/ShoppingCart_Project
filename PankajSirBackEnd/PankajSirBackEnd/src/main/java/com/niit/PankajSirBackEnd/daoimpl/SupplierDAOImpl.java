package com.niit.PankajSirBackEnd.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.PankajSirBackEnd.dao.SupplierDAO;
import com.niit.PankajSirBackEnd.model.Supplier;

@Repository("supplierDAO")
@EnableTransactionManagement
@Transactional
public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	
	public boolean save(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean update(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
	}

	public boolean delete(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return false;
		}
		
	}

	public Supplier getById(String id) {
		try {
			sessionFactory.getCurrentSession().get(Supplier.class, id);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean getByName(String name) {
		sessionFactory.getCurrentSession().get(Supplier.class, name);
		return false;
	}

	public List<Supplier> list() {
		sessionFactory.getCurrentSession().createQuery("from Category").list();
		return null;
	}

}
