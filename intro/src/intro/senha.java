package intro;
import java.util.Scanner;

public class senha {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("digite a senha");
		String senha = teclado.nextLine();
		
		while(!senha.equals("ifpb")) {
			System.out.println("tente outra vez");
			senha = teclado.nextLine();
		}
		
		teclado.close();
		System.out.println("ok, vc acertou");
		
	}

}
