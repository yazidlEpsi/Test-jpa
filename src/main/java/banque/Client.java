package banque;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import model.Emprunt;

@Entity
@Table(name="Client")
public class Client {
	
	@Id
	@GeneratedValue
	private Long id_client;
	@Embedded
	private Adresse Adresse;

	@Column
	private Date DateDeNaissance;
	
	@ManyToMany
	(mappedBy="Client")
	private List<Compte> Compte;
	
	@ManyToOne
	@JoinColumn(name="id_banque")
    private Banque Banque;
	
	public Client() {
	
	}
	
	public List<Compte> getCompte() {
		return Compte;
	}

	public void setCompte(List<Compte> compte) {
		Compte = compte;
	}

	public Long getId_client() {
		return id_client;
	}

	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}

	public Banque getBanque() {
		return Banque;
	}

	public void setBanque(Banque banque) {
		Banque = banque;
	}

	public Adresse getAdresse() {
		return Adresse;
	}
	public void setAdresse(Adresse adresse) {
		Adresse = adresse;
	}

	public Date getDateDeNaissance() {
		return DateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		DateDeNaissance = dateDeNaissance;
	}
}

@Embeddable
class Adresse {

	@Column
	private int codepostal;
	@Column
	private String ville;
	@Column
	private String rue;
	
	public Adresse(){}

	public int getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
}
