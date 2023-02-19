package intro;
import java.util.Random;

public class do_while {

	public static void main(String[] args) {
		
		Random sorteio = new Random();
		int numero;

		do {
			numero = sorteio.nextInt(59) + 1;
			System.out.println(numero);
		}
		while (numero != 51);
		
	}

}
