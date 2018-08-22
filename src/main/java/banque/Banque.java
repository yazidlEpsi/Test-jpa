package banque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Banque")
public class Banque {
/*
kjbdfqjkbf
*/
	@Id
	@GeneratedValue
	private Long id_banque ;
	@Column
	private String nom;
	@OneToMany(mappedBy="Banque")
    private List<Client> Client;
	
	public Banque() {

	}
	
	public Long getId_banque() {
		return id_banque;
	}

	public void setId_banque(Long id_banque) {
		this.id_banque = id_banque;
	}

	public List<Client> getClient() {
		return Client;
	}

	public void setClient(List<Client> client) {
		Client = client;
	}

	public Long getId() {
		return id_banque;
	}
	public void setId(Long id) {
		this.id_banque = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
