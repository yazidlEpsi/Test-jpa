package model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Emprunt")
public class Emprunt {
	@Id
	private String id;
	@Column
	private String date_debut;
	@Column
	private String date_fin;
	@Column
	private String delai;
	
	@ManyToMany
	(mappedBy="Emprunt")
	private List<Livre> Livre;

	@ManyToOne
	@JoinColumn(name="id_client")
    private Client client; 
	
	 public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}

	public String getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}

	public String getDelai() {
		return delai;
	}

	public void setDelai(String delai) {
		this.delai = delai;
	}

	public List<Livre> getLivre() {
		return Livre;
	}

	public void setLivre(List<Livre> livre) {
		Livre = livre;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


}
