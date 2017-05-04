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
		Address address3 = new Address();
		address3.setStreet("Viale Emilio Po 380");
		address3.setCity("Modena");
		address3.setState("MO");
		address3.setZipcode("411126");
		address3.setCountry("Italy");
		
		//RW Lion Corso Felice Cavallotti, 17, 28100 Novara, Italy
		Address address2 = new Address();
		address2.setStreet("Corso Felice Cavallotti 17");
		address2.setCity("Novara");
		address2.setState("NV");
		address2.setZipcode("28100");
		address2.setCountry("Italy");
		
		//Planeta De Agostini via G. da Verrazano, 15 c.so della Vittoria, 91,28100 Novara
		Address address1 = new Address();
		address1.setStreet("Via G. da Verrazano 15");
		address1.setCity("Novara");
		address1.setState("NV");
		address1.setZipcode("28100");
		address1.setCountry("Italy");
		
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
		provider1.setAddress(address1);
		
		Provider provider2 = new Provider();
		provider2.setName("RW Lion");
		provider2.setPhoneNumber("+39 3654 7574");
		provider2.setEmail("relazioni.media@rwedizioni.it");
		provider2.setAddress(address2);
		
		Provider provider3 = new Provider();
		provider3.setName("Panini Comics");
		provider3.setPhoneNumber("+39 1432 5352");
		provider3.setEmail("relazioni.media@panini.it");
		provider3.setAddress(address3);
		
		//PRODUCT
		/*Product:
		@id: Long
		@name: String
		@description: String
		@price: Float*/

		
		//VENDUTO DA RW LION
		Product product1 = new Product();
		product1.setName("Hellblazer n.13");
		product1.setPrice(3.5F);
		product1.setDescription("Alla fine degli anni 80, sulle pagine di Swamp Thing, Alan Moore "
				+ "ridefinì il fumetto dell’orrore e tra i tanti personaggi che creò durante la sua "
				+ "gestione della serie John Constatine ebbe subito un ottimo riscontro da parte del"
				+ " pubblico, al punto che ben presto la DC Comics decise di dedicargli una testata…"
				+ " una serie che adesso siamo lieti di riproporre integralmente a partire dal numero uno!");
		product1.setCode("9788868739065");

		//VENDUTO DA PLANETA
		Product product2 = new Product();
		product2.setName("Starman Omnibus n.2");
		product2.setPrice(38F);
		product2.setDescription("Secondo volume antologico dedicato al riluttante eroe di James Robinson."
				+ " Un capitolo imprescindibile nella storia del moderno fumetto supereroistico."
				+ "Contiene: Starman 17-29, Showcase ?95 12, Showcase ‘96 4-5, Starman Annual 1");
		product2.setCode("9788468400051");

		//VENDUTO DA PLANETA DE AGOSTINI
		Product product3 = new Product();
		product3.setName("Lo Schifo");
		product3.setPrice(30F);
		product3.setDescription("Sei afflitto da persistenti malinconie dello spirito? Sei incapace di "
				+ "dormire nell’antiquato spazio tridimensionale? Sei stanco di supervisionare mondi "
				+ "che vedi solo tu? ");
		product3.setCode("9788468402482");

		//VENDUTO DALLA PANINI COMICS
		Product product4 = new Product();
		product4.setName("One Punch Man");
		product4.setPrice(4.2F);
		product4.setDescription("IL MANGA DEL MOMENTO, UN GRANDE CULT MONDIALE Sulla città Z sta per "
				+ "abbattersi un gigantesco meteorite. Genos e gli altri eroi di Classe S vengono "
				+ "chiamati dall’Associazione Eroi per sventare minaccia... ma non toccherà di nuovo "
				+ "a Saitama far fronte a una situazione disperata?");
		product4.setCode("977228012290160025");
		
		
		//ASSOCIAZIONE Provider-Prodotti
		
		//Prodotti della Planeta De Agostini(Provider1)
		List<Product> products1 = new ArrayList();
		products1.add(product2);
		products1.add(product3);
		provider1.setProducts(products1);
		
		//Prodotti della RW Lion(Provider2)
		List<Product> products2 = new ArrayList();
		products2.add(product1); //E' una ristampa XD
		provider2.setProducts(products2);
		
		//Prodotti della Panini Comics(Provider3)
		List<Product> products3 = new ArrayList();
		products3.add(product4);
		provider3.setProducts(products3);

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(provider1);
		em.persist(provider2);
		em.persist(provider3);
		em.persist(address1);
		em.persist(address2);
		em.persist(address3);
		em.persist(address4);
		em.persist(product1);
		em.persist(product2);
		em.persist(product3);
		em.persist(product4);
		tx.commit();
		em.close();
		emf.close();

	}

}

		
		
		
		
		