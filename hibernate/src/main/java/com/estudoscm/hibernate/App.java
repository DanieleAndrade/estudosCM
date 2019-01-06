package com.estudoscm.hibernate;

import org.hibernate.Session;

import com.estudoscm.model.Address;
import com.estudoscm.model.HibernateSession;
import com.estudoscm.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateSession.getSessionFactory().openSession();
    	
    	User user = new User();
    	Address address = new Address();
    	
    	address.setNumber(555);
    	address.setStreet("Rua A");
    	address.setUser(user);
    	
    	user.setName("Daniele");
    	user.setLastName("Andrade");
    	user.setUsername("danieleandrade");
    	user.setAddress(address);
    	
        System.out.println(session);
        System.out.println(user.getUsername() + " " + user.getName() + " " + user.getLastName());
        System.out.println(user.getAddress().getStreet());
    }
}
