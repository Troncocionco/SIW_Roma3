package it.uniroma3.siw.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless(name="operaFacade")
public class OperaFacade {
	
	@PersistenceContext(unitName="progetto")
	private EntityManager em;
	
	public Opera creaOpera(String titolo, Integer anno, String tecnica, String dimensioni, Autore autore) {

		Opera o = new Opera(titolo, anno, tecnica, dimensioni, autore);
		em.persist(o);
		return o;
	}
	
	public List<Opera> getAllOpere(){
		try {
			TypedQuery<Opera> q = em.createQuery("SELECT o FROM Opera o", Opera.class);
			return q.getResultList();
		} 
		catch (Exception e) {
			String q = "La galleria è vuota";
			System.out.println(q);
			return null;
		}
	}
	
	public List<Opera> getOpereByAnno(Integer anno) {

		try {
			TypedQuery<Opera> q = em.createQuery("SELECT o FROM Opera o WHERE o.anno =: anno", Opera.class);
			q.setParameter("anno", anno);
			return q.getResultList();
		} 
		catch (Exception e) {
			String q = "Non ci sono opere di questo anno";
			System.out.println(q);
			return null;
		}
	}
	
	public List<Opera> getOpereByAutore(Autore autore) {

		try {
			TypedQuery<Opera> q = em.createQuery("SELECT o FROM Opera o WHERE o.autore =: autore", Opera.class);
			q.setParameter("autore", autore);
			return q.getResultList();
		} 
		catch (Exception e) {
			String q = "Non ci sono opere di questo autore";
			System.out.println(q);
			return null;
		}
	}
	
	public Opera getOperaByID(long id) {
	
		try {
			TypedQuery<Opera> q = em.createQuery("SELECT o FROM Opera o WHERE o.id =: id", Opera.class);
			q.setParameter("id", id);
			return q.getSingleResult();
		} 
		catch (Exception e) {
			String q = "L'opera con id " +id+ " non è presente";
			System.out.println(q);
			return null;
		}
	}
	
	public List<Opera> getOpereByTecnica(String tecnica) {

		try {
			TypedQuery<Opera> q = em.createQuery("SELECT o FROM Opera o WHERE o.tecnica =: tecnica", Opera.class);
			q.setParameter("tecnica", tecnica);
			return q.getResultList();
		} 
		catch (Exception e) {
			String q = "Non ci sono opere con questa tecnica";
			System.out.println(q);
			return null;
		}
	}
	
	public void updateOpera(Opera o) {
		em.merge(o);
	}
	
	public void deleteOpera(Opera o) {
		o = em.find(Opera.class, o.getId());
		em.remove(o);
	}
	
	public void deleteOperaByID(long id) {
		Opera o = getOperaByID(id);
		deleteOpera(o);
	}
}
