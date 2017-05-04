# Esercizi_SIW_uniroma3


siw-servlet-es1
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
		
		
		//PROVIDER	VANNO AGGIUNTI GLI ID DELLE ADDRESS
		/*Provider: 
		@id: Long
		@name: String
		@phoneNumber: String
		@email: String*/
		
		Provider provider1 = new Provider();
		provider1.setName("Planeta De Agostini");
		provider1.setPhoneNumber("+39 0321 4241");
		provider1.setEmail("relazioni.media@deagostini.it");

		Provider provider2 = new Provider();
		provider2.setName("RW Lion");
		provider2.setPhoneNumber("+39 3654 7574");
		provider2.setEmail("relazioni.media@rwedizioni.it");

		Provider provider3 = new Provider();
		provider3.setName("Panini Comics");
		provider3.setPhoneNumber("+39 1432 5352");
		provider3.setEmail("relazioni.media@panini.it");
		
		
		//PRODUCT
		/*Product:
		@id: Long
		@name: String
		@description: String
		@price: Float*/

		Product product1 = new Product();
		product1.setName("Hellblazer n.13");
		product1.setPrice(3.5F);
		product1.setDescription("Alla fine degli anni 80, sulle pagine di Swamp Thing, Alan Moore "
				+ "ridefinì il fumetto dell’orrore e tra i tanti personaggi che creò durante la sua "
				+ "gestione della serie John Constatine ebbe subito un ottimo riscontro da parte del"
				+ " pubblico, al punto che ben presto la DC Comics decise di dedicargli una testata…"
				+ " una serie che adesso siamo lieti di riproporre integralmente a partire dal numero uno!");
		product1.setCode("9788868739065");



		
		Product product2 = new Product();
		product2.setName("Starman Omnibus n.2");
		product2.setPrice(38F);
		product2.setDescription("Secondo volume antologico dedicato al riluttante eroe di James Robinson."
				+ " Un capitolo imprescindibile nella storia del moderno fumetto supereroistico."
				+ "Contiene: Starman 17-29, Showcase ?95 12, Showcase ‘96 4-5, Starman Annual 1");
		product2.setCode("9788468400051");






		
		Product product3 = new Product();
		product3.setName("Lo Schifo");
		product3.setPrice(30F);
		product3.setDescription("Sei afflitto da persistenti malinconie dello spirito? Sei incapace di "
				+ "dormire nell’antiquato spazio tridimensionale? Sei stanco di supervisionare mondi "
				+ "che vedi solo tu? ");
		product3.setCode("9788468402482");





		
		Product product4 = new Product();
		product4.setName("One Punch Man");
		product4.setPrice(4.2F);
		product4.setDescription("IL MANGA DEL MOMENTO, UN GRANDE CULT MONDIALE Sulla città Z sta per "
				+ "abbattersi un gigantesco meteorite. Genos e gli altri eroi di Classe S vengono "
				+ "chiamati dall’Associazione Eroi per sventare minaccia... ma non toccherà di nuovo "
				+ "a Saitama far fronte a una situazione disperata?");
		product4.setCode("977228012290160025");
		
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
		
		//CUSTOMER
		/*-id: Long
		-firstName: String
		-lastName: String
		-email: String
		-phoneNumber: String
		-dateOfBirth: Date
		-registrationDate: Date*/
		 Customer customer = new Customer();
		 customer.setFirstName("Giacomo");
		 customer.setLastName("Tronchin");
		 customer.setEmail("giacomio15@hotmail.it");
		 customer.setPhoneNumber("+39 345 5892 593");
		 
		 //Order
		 Order order1 = new Order();
		 order1.setCreationTime(null);
		 order1.setCustomer(customer);
		 
		 //OrderLine
		 OrderLine lineaOrdine1_1 = new OrderLine();
		 lineaOrdine1_1.setOrder(order1);
		 List<Product> p1 = new ArrayList<Product>();
		 p1.add(product1);
		 lineaOrdine1_1.setProducts(p1);
		 lineaOrdine1_1.setQuantity(1);
		 lineaOrdine1_1.setUnitPrice(product1.getPrice());
		 
		 OrderLine lineaOrdine1_2 = new OrderLine();
		 lineaOrdine1_2.setOrder(order1);
		 List<Product> p2 = new ArrayList<Product>();
		 p2.add(product4);
		 lineaOrdine1_2.setProducts(p2);
		 lineaOrdine1_2.setQuantity(3);
		 lineaOrdine1_2.setUnitPrice(product4.getPrice());
		 
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(product1);
			em.persist(product2);
			em.persist(product3);
			em.persist(product4);
			em.persist(provider1);
			em.persist(provider2);
			em.persist(provider3);
			em.persist(address1);
			em.persist(address2);
			em.persist(address3);
			em.persist(address4);
			em.persist(customer);
			em.persist(order1);
			em.persist(lineaOrdine1_1);
			em.persist(lineaOrdine1_2);
			
			em.close();
			emf.close();

	}


}
