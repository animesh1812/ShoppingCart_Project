package com.niit.PankajSirBackEnd.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.PankajSirBackEnd.model.Supplier;

@Repository
@Component
public interface SupplierDAO {
	public boolean save(Supplier supplier);
	public boolean update(Supplier supplier);
	public boolean delete(Supplier supplier);
	public Supplier getById(String id);
	public boolean getByName(String name);
	public List<Supplier> list();
	

}
