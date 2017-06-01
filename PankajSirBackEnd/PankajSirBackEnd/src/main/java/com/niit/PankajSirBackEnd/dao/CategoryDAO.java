package com.niit.PankajSirBackEnd.dao;

import java.util.List;

import com.niit.PankajSirBackEnd.model.Category;

public interface CategoryDAO {
	public boolean save(Category categories);
	public boolean update(Category categories);
	public boolean delete(Category categories);
	public Category getById(String Id);
	public Category getByName(String Name);
	public List<Category> list();

}
