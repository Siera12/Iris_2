package com.soap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soap.PersonService")
public class PersonServiceImpl implements PersonService{
	private static Map<Integer,Person> persons = new HashMap<Integer,Person>();
	
	@Override
	public boolean addPerson(Person p) {
		if(persons.get(p.getId()) != null) return false;
		persons.put(p.getId(), p);
		return true;
	}

	@Override
	public boolean deletePerson(int id) {
		if(persons.get(id) == null) return false;
		persons.remove(id);
		return true;
	}

	@Override
	public Person getPerson(int id) {
		return persons.get(id); 
	}

	@Override
	public Person[] getAllPersons() {
		
		Collection<Person> vs=persons.values();
		Person[] p=new Person[vs.size()];		
		p=vs.toArray(p);
		return p;
		}
	
}