package banque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Compte")
public class Compte {
	
	@Id
	@GeneratedValue
	private long id_compte;
	@Column
	private String numero;
	@Column
	private double solde;
	
	@OneToMany(mappedBy="Compte")
    private List<Operation> Operation;
	
	@ManyToMany
    @JoinTable(name="possede", 
         joinColumns= @JoinColumn(name="id_client_cim", referencedColumnName="id_compte"),
	     inverseJoinColumns= @JoinColumn(name="id_compte_cim", referencedColumnName="id_client")
    )private List<Client> Client;

	
	public Compte() {
	}
	
	
	public long getId_compte() {
		return id_compte;
	}

	public void setId_compte(long id_compte) {
		this.id_compte = id_compte;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public List<Client> getClient() {
		return Client;
	}

	public void setClient(List<Client> client) {
		Client = client;
	}

}
