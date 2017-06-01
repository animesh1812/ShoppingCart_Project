package com.niit.PankajSirBackEnd.dao;

import java.util.List;

import com.niit.PankajSirBackEnd.model.Register;

public interface RegisterDAO {
	
	public boolean save(Register register);
	public boolean update(Register register);
	public Register get(String id);
	public List<Register> list();

}
