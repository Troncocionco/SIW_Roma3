package it.uniroma3.products;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import it.uniroma3.products.Product;
import it.uniroma3.products.Provider;
import it.uniroma3.products.Order;
import it.uniroma3.products.OrderLine;
import it.uniroma3.products.Address;

public class CommerceMain {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("commerce-unit");
		EntityManager em = emf.createEntityManager();

		
		
		//ADDRESS
		/*
		@street: String
		@city: String
		@state: String
		@zipcode: String
		@country: String*/
		
		
		//Panini Comics viale Emilio Po 380, 41126 Modena
		Address address1 = new Address();
		address1.setStreet("Viale Emilio Po 380");
		address1.setCity("Modena");
		address1.setState("MO");
		address1.setZipcode("411126");
		address1.setCountry("Italy");
		
		//RW Lion Corso Felice Cavallotti, 17, 28100 Novara, Italy
		Address address2 = new Address();
		address2.setStreet("Corso Felice Cavallotti 17");
		address2.setCity("Novara");
		address2.setState("NV");
		address2.setZipcode("28100");
		address2.setCountry("Italy");
		
		//Planeta De Agostini via G. da Verrazano, 15 c.so della Vittoria, 91,28100 Novara
		Address address3 = new Address();
		address3.setStreet("Via G. da Verrazano 15");
		address3.setCity("Novara");
		address3.setState("NV");
		address3.setZipcode("28100");
		address3.setCountry("Italy");
		
		//Casa mia 
		Address address4 = new Address();
		address4.setStreet("Via Pietro Nenni 10");
		address4.setCity("Pomezia");
		address4.setState("RM");
		address4.setZipcode("00071");
		address4.setCountry("Italy");

		
		//Provider
		
		Provider provider1 = new Provider();
		provider1.setName("Planeta De Agostini");
		provider1.setPhoneNumber("+39 0321 4241");
		provider1.setEmail("relazioni.media@deagostini.it");
		provider1.setAddress(address3);
		

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(provider1);
		em.persist(address1);
		em.persist(address2);
		em.persist(address3);
		em.persist(address4);
		tx.commit();
		em.close();
		emf.close();

	}

}

		
		
		
		
		