package com.examples.daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.examples.models.Category;
import com.examples.models.Product;

@Repository(value="productDao")
@Transactional
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private SessionFactory sessionFactory;


	public boolean addProduct(Product p) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(p);
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


	public boolean deleteProduct(String productId) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Product p=new Product();
			p.setProductId(productId);
			session.delete(p);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}


	public boolean updateProduct(Product p) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			session.update(p);
			
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}


	public Product getProduct(String productId) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Product p=session.get(Product.class, productId);
			return p;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
