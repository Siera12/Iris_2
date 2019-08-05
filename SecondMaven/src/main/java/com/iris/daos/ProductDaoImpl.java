package com.iris.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iris.models.Product;
import com.iris.providers.SessionFactoryProvider;

public class ProductDaoImpl implements ProductDao{

	public boolean addProduct(Product p) {
		try {
		Session session=SessionFactoryProvider.getSF().openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(p);
		tx.commit();
		session.close();
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteProduct(int productId) {
			try {
			Session session=SessionFactoryProvider.getSF().openSession();
			Transaction tx=session.beginTransaction();
			
			Product p=session.get(Product.class, productId);
			session.delete(p);
			tx.commit();
			session.close();
			return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
	}

	public boolean updateProduct(Product p) {
		try {
			Session session=SessionFactoryProvider.getSF().openSession();
			Transaction tx=session.beginTransaction();
			
			session.update(p);
			tx.commit();
			session.close();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Product getProduct(int productId) {
		try {
			Session session=SessionFactoryProvider.getSF().openSession();
			
			
			Product pro=session.get(Product.class,productId);
			return pro;
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}

	public List<Product> getAllProducts() {
		
		return null;
	}
	
	
	
	

}
