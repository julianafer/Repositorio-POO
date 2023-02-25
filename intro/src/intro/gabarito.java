package intro;

import java.util.Scanner;

public class gabarito {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Digite o gabarito com 10 caracteres; ");
		String gabarito_t = teclado.nextLine();
		String[] gabarito = gabarito_t.split("");
				
		System.out.println("Digite a resposta com 10 caracteres: ");
		String resposta_t = teclado.nextLine();
		String[] resposta = resposta_t.split("");
				
		int acertos = 0;
		for(int i=0; i <gabarito.length; i++) {
			if(gabarito[i].equalsIgnoreCase(resposta[i])) {
				acertos++;
			}
		}
				
		System.out.println("Quantidade de acertos: " + acertos);
		teclado.close();
		
	}

}
