package com.examples.daos;

import java.util.List;


import com.examples.models.Product;

public interface ProductDao {
	
	public boolean addProduct(Product p);
	
	public List<Product> getAllProducts();
	
	public boolean deleteProduct(String productId);
	
	public boolean updateProduct(Product p);
	
	public Product getProduct(String productId);

}
