package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity 

@Table(name="livre")
public class Livre {

	@Id
	private Integer id;
	@Column
	private String titre;
	@Column
	private String auteur;
	
	
	@ManyToMany
    @JoinTable(name="compo", 
         joinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID"),
	     inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID")
    )
	private Set<Emprunt> Emprunt;

	
	public Livre() {
	
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
}
