package objetos;

public class Retangulo {

	private int id;
	private double largura;
	private double comprimento;
	
	
	// métodos construtores
	public Retangulo(int id, double largura, double comprimento) {
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	public Retangulo() { } // dois métodos contutores para que eu possa escolher passar os parâmetros ou não

	public Retangulo(double valor) {
		this.largura = valor;
		this.comprimento = valor;
	}
	
	
	// getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	
	// métodos do objeto
	public double calcularArea() {
		return largura * comprimento;
	}
	
	public void enquadrar() {
		double media = (largura + comprimento) / 2;
		largura = media;
		comprimento = media;
	}
	
	public boolean ehQuadrado() {
		if (largura == comprimento)
			return true;
		else
			return false;
	}
	
	public boolean ehEquivalente(Retangulo outro) {
		if (this.calcularArea() == outro.calcularArea())
			return true;
		else
			return false;
	}
	
	public void redimensionar(double fator) {
		largura = largura * fator;
		comprimento = comprimento * fator;
	}
	
	public void redimensionar(Retangulo objeto) {
		largura = objeto.largura;
		comprimento = objeto.comprimento;
	}
	
	public double calcularPerimetro() {
		return (largura * 2) + (comprimento * 2);
	}

	
	// método toString
	public String toString() {
		return "Retangulo [id=" + id + ", largura=" + largura + ", comprimento=" + comprimento + "]";
	}
	
}
