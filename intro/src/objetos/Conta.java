package objetos;

public class Conta {

	private String numero;
	private String cpf;
	private double saldo;
	
	// método construtor
	public Conta(String numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = 0;
	}

	// getters e setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// métodos do objeto
	public void creditar(double valor) {
		saldo += valor;
	}
	
	public void debitar(double valor) {
		saldo -= valor;
	}
	
	public void transferir(double valor, Conta destino) {
		this.debitar(valor);
		destino.creditar(valor);
	}

	public boolean vazia() {
		if (saldo == 0)
			return true;
		else
			return false;
	}
	
	public Conta clonar() {
		Conta novaConta = new Conta(this.numero, this.cpf);
		novaConta.creditar(this.getSaldo());
		return novaConta;
	}

	// método toString
	public String toString() {
		return "Conta [numero=" + numero + ", cpf=" + cpf + ", saldo=" + saldo + "]";
	}
	
}
