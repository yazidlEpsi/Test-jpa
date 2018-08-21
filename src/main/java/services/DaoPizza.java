package services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Client;
import model.Emprunt;
import model.Livre;

public class DaoPizza implements IDaoPizza {
	private EntityManager em;
	
	public DaoPizza(EntityManager em)
	{
		this.em = em;
	}

	public Livre find(int id) {
		Livre l  = em.find(Livre.class, id);
		if(l !=null){
			return l;

		}else{
			return null;
		}
	}

	public Livre findByTitle(String title) {
		TypedQuery<Livre> req = em.createQuery("select l from Livre l where l.titre='"+title+"'", Livre.class);
		return req.getSingleResult();
	}

	public Emprunt searchEmprunt(int id) {
		TypedQuery<Emprunt> req = em.createQuery("select e from Emprunt e where e.id='"+id+"'", Emprunt.class);
		return req.getSingleResult();
	
	}

	public Client searchEmpruntToClient(String name) {
		TypedQuery<Client> req = em.createQuery("select c from Client c where c.nom='"+name+"'", Client.class);
		return req.getSingleResult();
	
	}

}
