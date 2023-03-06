package objetos;

public class Triangulo {

	public double base;
	public double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return (base * altura) / 2;
	}

	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	
}
