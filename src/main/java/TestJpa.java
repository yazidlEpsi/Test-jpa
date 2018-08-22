import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import banque.Banque;
import banque.Client;
import banque.Compte;
import banque.Operation;

public class TestJpa {

	
	public TestJpa(){
		
	}
	
	public static void main(String[] args) {
		EntityManagerFactory entityFactory = new Persistence().createEntityManagerFactory("banque");
		EntityManager entityManager = entityFactory.createEntityManager();
		Client c = new Client()	;
		Banque ba = new Banque();
		Compte cpt = new Compte();
		Operation o = new Operation();
		
		EntityTransaction tr = entityManager.getTransaction();
		tr.begin();
		entityManager.persist(c);
		entityManager.persist(ba);
		entityManager.persist(o);
		entityManager.persist(cpt);
		tr.commit();
		//IDaoPizza idao = new DaoPizza(entityManager);
		//Livre l = idao.find(1);
		//System.out.println( l.getTitre());
	
		//Emprunt e = new Emprunt();
		//System.out.println(idao.searchEmprunt(1).getLivre().get(0).getTitre());
		//List<Emprunt> le = idao.searchEmpruntToClient("YU").getEmprunt();
		

	}
	


}
