package objetos;

public class Aluno {

	private String nome;
	private int nota1;
	private int nota2;
	
	// método construtor
	public Aluno(String nome, int nota1, int nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	// getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	
	// métodos do objeto
	public int getMedia() {
		float media = (nota1 + nota2) / 2;
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

	// método toString
	public String toString() {
		return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}
	
}
