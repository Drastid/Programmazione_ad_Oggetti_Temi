package abbigliamento;

public class Capo {

	private Modello modello;
	private Materiale materiale;
	private Colore colore;

	public Capo(Modello modello, Materiale materiale, Colore colore) {
		this.modello = modello;
		this.materiale = materiale;
		this.colore = colore;

	}

	public double prezzo() {
		return this.modello.getCosto() + (this.modello.getQuantita() * this.materiale.getCosto());
	}

	@Override 
	public String toString(){
		return this.modello.getNome() + " " + this.colore.getNome() + " " + this.materiale.getNome();
	}

	public Colore getColore(){
		return this.colore;
	}

	public Materiale getMateriale(){
		return this.materiale;
	}

	public Modello getModello(){
		return this.modello;
	}

}
