package abbigliamento;

public class Materiale {

	private String nome;
	private double costo;

	public Materiale(String nome, double costo) {		
		this.nome = nome;
		this.costo = costo;

	}

	public String getNome(){
		return this.nome;
	}

	public double getCosto(){
		return this.costo;
	}
}
