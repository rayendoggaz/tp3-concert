package test;

import java.util.List;

import metier.MetierImpl;
import metier.Concert;

public class TestMetier {
	public static void main(String[] args) {
		MetierImpl metier = new MetierImpl();
		List<Concert> cons = metier.getConcertsParMotCle("TOUR");
		for (Concert c : cons)
			System.out.println(c.getNomConcert());
	}
}