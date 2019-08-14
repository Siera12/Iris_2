package com.examples.daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.examples.models.Category;

@Repository(value="categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao{
	
	@Autowired
	private SessionFactory sessionFactory;


	public boolean addCategory(Category c) {
		try {
			Session session=sessionFactory.getCurrentSession();
			//session.persist(c);
			session.saveOrUpdate(c);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}


	public List<Category> getAllCategories() {
		try
		{
			Session session=sessionFactory.getCurrentSession(); //hibernate
			Query q=session.createQuery("from Category");
			return q.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean deleteCategory(String categoryId) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Category c=new Category();
			c.setCategoryId(categoryId);
			session.delete(c);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}


	public boolean updateCategory(Category c) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			session.update(c);
			
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public Category getCategory(String categoryId) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Category c=session.get(Category.class, categoryId);
			return c;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}



