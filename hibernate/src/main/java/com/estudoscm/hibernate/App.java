package com.estudoscm.hibernate;

import java.util.List;

import org.hibernate.Session;

import com.estudoscm.model.Address;
import com.estudoscm.model.HibernateSession;
import com.estudoscm.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateSession.getSessionFactory().openSession();
    	
    	session.beginTransaction();
    	
    	Product product = session.find(Product.class, 4);
    	
    	if(product.getId() != null) {
    		session.remove(product);
    	}
    
    	
/*    	if(product.getId() != null) {
    		product.setName("Product Edited");
    		product.setPrice(50.00);
    		
    		session.update(product);
    	} */
    	
/*    	Product product = new Product();
    	product.setName("Produto 01");
    	product.setPrice(10.0);
    	
    	session.save(product);
    	
    	List<Product> products = session.createQuery("from Product").getResultList();
    	
    	Product p1 = session.find(Product.class, 2);
    	
    	System.out.println(p1.getName()); */
    	
    	session.getTransaction().commit();
    }
}
