package com.niit.PankajSirBackEnd.dao;

import java.util.List;

import com.niit.PankajSirBackEnd.model.User;

public interface UserDAO {
	public boolean save(User users);
	public boolean update (User users);
	public boolean delete (User users);
	public List<User> list();
	public User get(String id);
	public boolean validate (String id, String password);
}
