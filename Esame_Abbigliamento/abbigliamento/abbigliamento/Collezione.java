package abbigliamento;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class Collezione {

	private List<Capo> collezione = new LinkedList<>();
	
	
	public void add(Capo capo) {
		collezione.add(capo);
		
	}

	public Collection trova(Colore colore) {
		List<Capo> cercaColore = collezione.stream()
					.filter(c -> c.getColore().getNome().equals(colore.getNome()))
					.collect(Collectors.toList());
		return cercaColore;
	}

	public Collection trova(Materiale materiale) {
		List<Capo> cercaMateriale = collezione.stream()
					.filter(c -> c.getMateriale().getNome().equals(materiale.getNome()))
					.collect(Collectors.toList());
		return cercaMateriale;
	}

	public Collection trova(Modello modello) {
		List<Capo> cercaModello = collezione.stream()
					.filter(c -> c.getModello().getNome().equals(modello.getNome()))
					.collect(Collectors.toList());
		return cercaModello;
	}

}
