package objetos;

public class MatriculaMain {

	public static void main(String[] args) {

		Matricula matricula = new Matricula("20221370031");
		
		String ano = matricula.getAno();
		String periodo = matricula.getPeriodo();
		String codigoCurso = matricula.getCodigoCurso();
		String sequencia = matricula.getSequencia();
		
		System.out.println(ano);
		System.out.println(periodo);
		System.out.println(codigoCurso);
		System.out.println(sequencia);
		
	}

}
