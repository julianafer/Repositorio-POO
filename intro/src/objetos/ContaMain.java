package objetos;

public class ContaMain {

	public static void main(String[] args) {

		Conta conta1 = new Conta("101", "123456");
		Conta conta2 = new Conta("202", "654321");
		
		conta1.creditar(300);
		conta1.debitar(100);
		conta1.creditar(200);
		
		// System.out.println(conta1.getSaldo());
		// System.out.println(conta1);
		// System.out.println();
		
		conta1.transferir(100, conta2);
		// System.out.println(conta1);
		System.out.println(conta2);
		
		conta1.debitar(300);
		// System.out.println(conta1.vazia());
		
		Conta conta3 = conta2.clonar();
		System.out.println(conta3);
		
	}

}
