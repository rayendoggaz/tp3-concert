package metier;

import java.util.List;

public interface ImetierCatalogue {
	public List<Concert> getConcertsParMotCle(String mc);

	public void addConcert(Concert c);
}
