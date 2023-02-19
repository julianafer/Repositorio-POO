package intro;
import java.util.Scanner;

public class Amigo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual eh o seu nome?");
		String nome1 = teclado.nextLine();
		
		System.out.println(nome1 + ", de quem vc eh amg?");
		String nome2 = teclado.nextLine();
		
		System.out.println(nome1 + " eh amg de " + nome2);
		
		teclado.close();
		
	}

}
