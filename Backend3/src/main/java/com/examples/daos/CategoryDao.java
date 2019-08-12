package com.examples.daos;

import java.util.List;

import com.examples.models.Category;

public interface CategoryDao {
	
	public boolean addCategory(Category c);
	
	public List<Category> getAllCategories();
	
}
