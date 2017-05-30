package it.uniroma3.siw.model;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless(name="autoreFacade")
public class AutoreFacade {
	
	@PersistenceContext(unitName="progetto")
	private EntityManager em;
	
	public Autore creaAutore(String nome, String cognome, String nazionalita, Date dataDiNascita, Date dataDiMorte) {

		Autore a = new Autore(nome, cognome, nazionalita, dataDiNascita, dataDiMorte);
		em.persist(a);
		return a;
	}
	
	public List<Autore> getAllAutori() {
		
		try {
			TypedQuery<Autore> q = em.createQuery("SELECT a FROM Autore a", Autore.class);
			return q.getResultList();
		} 
		catch (Exception e) {
			String q = "La lista degli autori è vuota";
			System.out.println(q);
			return null;
		}
	}
	
	public Autore getAutoreByID(long id) {
	
		try {
			TypedQuery<Autore> q = em.createQuery("SELECT a FROM Autore a WHERE a.id =: id", Autore.class);
			q.setParameter("id", id);
			return q.getSingleResult();
		} 
		catch (Exception e) {
			String q = "L'autore con id " +id+ " non è presente";
			System.out.println(q);
			return null;
		}
	}
	
	public void updateAutore(Autore a) {
		em.merge(a);
	}
	
	public void deleteAutore (Autore a) {
		a = em.find(Autore.class, a.getId());
		em.remove(a);
	}
	
	public void deleteAutoreByID (long id) {
		Autore a = getAutoreByID(id);
		deleteAutore(a);
	}
}
