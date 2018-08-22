package banque;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Operation")
public class Operation {
	@Id
	@GeneratedValue
	private Long id_operation;
	@Column
	private Date date;
	@Column
	private double montant;
	@Column
	private String motif;
	@ManyToOne
	@JoinColumn(name="id_compte")
    private Compte Compte;
	
	public Operation() {
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public Compte getCompte() {
		return Compte;
	}

	public void setCompte(Compte compte) {
		Compte = compte;
	}

	public Long getId_operation() {
		return id_operation;
	}

	public void setId_operation(Long id_operation) {
		this.id_operation = id_operation;
	}


}
