package objetos;

public class RetanguloMain {

	public static void main(String[] args) {
		
		// Retangulo r = new Retangulo(1, 3, 5);
		// System.out.println(r);
		// r.enquadrar();
		// System.out.println(r);
		
		Retangulo r1, r2;
		r1 = new Retangulo(1, 2, 4);
		r2 = new Retangulo(2, 3, 10);
		// System.out.println(r1.ehEquivalente(r2));
		
		Retangulo r3 = new Retangulo(3, 2, 2);
		// System.out.println(r3.calcularPerimetro());
		
		Retangulo r4 = new Retangulo(5);
		System.out.println(r4.calcularArea());
		
	}

}
