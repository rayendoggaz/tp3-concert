package metier;

import java.io.Serializable;

public class Concert implements Serializable {
	private Long idConcert;
	private String nomConcert;
	private double prix;

	public Concert() {
		super();
	}

	public Concert(String nomConcert, double prix) {
		super();
		this.nomConcert = nomConcert;
		this.prix = prix;
	}

	public Long getIdConcert() {
		return idConcert;
	}

	public void setIdConcert(Long idConcert) {
		this.idConcert = idConcert;
	}

	public String getNomConcert() {
		return nomConcert;
	}

	public void setNomConcert(String nomConcert) {
		this.nomConcert = nomConcert;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}