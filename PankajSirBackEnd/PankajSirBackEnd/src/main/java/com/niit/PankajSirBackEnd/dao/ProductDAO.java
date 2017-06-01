package com.niit.PankajSirBackEnd.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.niit.PankajSirBackEnd.model.*;

@Component
public interface ProductDAO {

	public boolean addProduct(Product p);
	public boolean editProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean getProductById(String id);
	public List<Product> getAllProducts();
	
}