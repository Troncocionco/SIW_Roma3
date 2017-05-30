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
		EntityTransaction tx = em.getTransaction(); tan
		tx.begin();
		TypedQuery<Product> query = em.createNamedQuery("findAll", Product.class);
		List<Product> products = query.getResultList();
		tx.commit();
		return products;
	}//END of getProducts
	
	public void delete(Product p) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercitazione-unit");
		em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(em.contains(p) ? p : em.merge(p));	
		//Cerca per operatore ternario:"Se em.contains(p) è true, allora p, altrimenti em.merge(p)(
		et.commit();
		em.close();
		emf.close();
	}
	
	public Product getOneProduct(long id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercitazione-unit");
		em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Product p = em.find(Product.class, id);
		return p;
	}
	
}
