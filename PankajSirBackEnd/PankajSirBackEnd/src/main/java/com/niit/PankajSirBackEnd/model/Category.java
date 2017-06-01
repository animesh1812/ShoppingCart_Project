package com.niit.PankajSirBackEnd.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Category")
public class Category {
	@Id
	@Column(name="Product_Id")
	private String id;
	@Column(name="Product_Name")
	private String name;
	@Column(name="Product_Description")
	private String description;
	private Set<Product> product;
	public String getName() {
		return name;
	}
	//@OneToMany(mappedBy="category", fetch = FetchType.EAGER)
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
