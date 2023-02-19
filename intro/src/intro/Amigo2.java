package intro;
import java.util.Scanner;
import javax.swing.JOptionPane; // não tá funcionando

public class Amigo2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String nome1 = JOptionPane.showInputDialog("Qual eh o seu nome?");
		String nome2 = JOptionPane.showInputDialog("De quem vc eh amg?");
		
		JOptionPane.showMessageDialog(null, nome1 + " eh amg de " + nome2);
		teclado.close();
		
	}

}
