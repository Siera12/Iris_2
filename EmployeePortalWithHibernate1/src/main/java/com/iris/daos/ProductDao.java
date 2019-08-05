package com.iris.daos;

import java.util.List;

import com.iris.models.Product;

public interface ProductDao {

	public boolean addProduct(Product p);
	public boolean deleteProduct(int productId);
	public boolean updateProduct(Product p);
	public Product getProduct(int productId);
	public List<Product> getAllProducts();
	
}
