package intro;
import java.util.Random;

public class sorteio {

	public static void main(String[] args) {

		Random sorteio = new Random();
		int numero;
		
		for(int i=1; i<=6; i++) {
			
			numero = sorteio.nextInt(59) + 1;
			System.out.println(numero);
			
		}
		
	}

}
