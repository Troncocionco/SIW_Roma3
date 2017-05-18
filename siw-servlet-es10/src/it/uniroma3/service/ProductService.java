package it.uniroma3.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import it.uniroma3.model.Product;

public class ProductService {

	private EntityManager em;
	
	public ProductService() {
		
	}
	
	public Product insertProduct(Product product) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercitazione-unit");
		this.em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(product);
		tx.commit();
		
		em.close();
		emf.close();
		return product;
	}//END of insertProduct
	
	public List<Product> getProducts() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercitazione-unit");
		this.em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		TypedQuery<Product> query = em.createNamedQuery("findAll", Product.class);
		List<Product> products = query.getResultList();
		tx.commit();
		return products;
	}//END of getProducts
}
