package com.examples.daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.examples.models.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private SessionFactory sessionFactory;


	public boolean addProduct(Product p) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(p);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}


	public List<Product> getAllProducts() {
		try
		{
			Session session=sessionFactory.getCurrentSession(); //hib
			Query q=session.createQuery("from Product");
			return q.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
