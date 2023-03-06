package objetos;

public class AlunoFlexMain {

	public static void main(String[] args) {

		AlunoFlex a1 = new AlunoFlex("joao", 100, 70); // não sei como faz :(
		AlunoFlex a2 = new AlunoFlex("maria", 90, 50, 70, 80);
		System.out.println(a1.getNome() + a1.getMedia() + a1.getSituacao());
		System.out.println(a2.getNome() + a2.getMedia() + a2.getSituacao());
		
	}

}
