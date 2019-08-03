package com.iris.practice;

import com.iris.daos.PersonDao;
import com.iris.daos.PersonDaoImpl;
import com.iris.models.Person;

public class App 
{
    public static void main( String[] args )
    {
    	Person p=new Person();
    	p.setName("Genji");
    	p.setAge(35);
    	
    	PersonDao daoObj=new PersonDaoImpl();
    	boolean r=daoObj.addPerson(p);
    	if(r){
    		System.out.println("Person added");
    	}
    	else {
    		System.out.println("Person not added");
    	}
    	
    }
}