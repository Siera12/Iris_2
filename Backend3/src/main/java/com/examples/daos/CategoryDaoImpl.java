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
			session.save(c);
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
}

