package com.iris.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iris.models.Person;
import com.iris.providers.SessionFactoryProvider;

public class PersonDaoImpl implements PersonDao {

	public boolean addPerson(Person p) {
		Session session=SessionFactoryProvider.getSF().openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(p);
		tx.commit();
		session.close();
		
		return true;
	
	}

	public boolean deletePerson(int personId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updatePerson(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	public Person getPerson(int pId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
