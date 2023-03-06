package objetos;

public class Venda {

	private String data;
	private String nome;
	private int quantidade;
	private double valor;
	
	public Venda(String data, Produto produto, int quantidade) {
		this.data = data;
		this.quantidade = quantidade;
		this.valor = produto.getPreco() * quantidade;
		produto.setEstoque(produto.getEstoque() - quantidade);
	}

	@Override
	public String toString() {
		return "Venda [data=" + data + ", nome=" + nome + ", quantidade=" + quantidade + ", valor=" + valor + "]";
	}
	
}
