package objetos;

import java.util.Arrays;

public class AlunoFlex {
	private String nome;
	private int[] notas;
	
	
	public AlunoFlex(String nome, int... notas) {
		this.nome = nome;
		this.notas = notas;
	}
	
	public int getMedia() {
		float soma = 0;
		for(int valor : notas)
			soma += valor;
		float media = soma / notas.length;
		return Math.round(media);
	}

	public String getSituacao() {
		if(this.getMedia() >= 70)
			return "aprovado";
		else
			if(this.getMedia() >= 40)
				return "final";
			else
				return "reprovado";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "AlunoFlex [nome=" + nome + ", notas=" + Arrays.toString(notas) + "]";
	}

}
