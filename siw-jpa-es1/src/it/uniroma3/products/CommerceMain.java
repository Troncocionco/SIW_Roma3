package it.uniroma3.products;

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
		
		Product product = new Product();
		product.setName("Spara Chiodi");
		product.setPrice(3.5F);
		product.setDescription("A wonderful bla bla");
		product.setCode("9781853262715-AA");
		
		
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
		
		/*Product:
		@id: Long
		@name: String
		@description: String
		@price: Float*/

	//	Product product = new Product();
		product.setName("Spara Chiodi");
		product.setPrice(3.5F);
		product.setDescription("A wonderful bla bla");
		product.setCode("9781853262715-AA");
		
		
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(product);
		tx.commit();
		
		em.close();
		emf.close();
	}


}
