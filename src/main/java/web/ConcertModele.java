package web;

import java.util.ArrayList;
import java.util.List;

import metier.Concert;

public class ConcertModele {
	private String motCle;
	List<Concert > Concert = new ArrayList<>();
	
	public String getMotCle() {
		return motCle;
	}
	
	public void setMotCle(String motcle) {
		this.motCle = motCle;
	}
	
	public List<Concert > getConcert() {
		return Concert;
	}
	
	public void setConcert(List<Concert > Concert) {
		this.Concert = Concert;
	}
}
