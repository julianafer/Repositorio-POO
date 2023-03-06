package objetos;

import java.util.Arrays;

public class AlunoFlex {

	public String nome;
	public String matricula;
	public int[] notas;
	
	public AlunoFlex(String nome, String matricula, int[] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getMedia() {
		int soma = 0;
		for (int n : notas)
			soma += n;
		int media = soma / notas.length;
		return Math.round(media);
	}
	
	public String getSituacao() {
		if (this.getMedia() >= 70)
			return "aprovado";
		else
			if (this.getMedia() >= 40)
				return "final";
			else
				return "reprovado";
	}

	public String toString() {
		return "AlunoFlex [nome=" + nome + ", matricula=" + matricula + ", notas=" + Arrays.toString(notas) + "]";
	}
	
}
