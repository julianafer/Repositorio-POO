package intro;

public class Array {

	public static void main(String[] args) {

		int[] numeros = new int[4]; // tamanho fixo
		numeros[0] = 8;
		numeros[1] = 3;
		numeros[2] = 9;
		numeros[3] = 2;
		
		/*
		System.out.println(numeros.length);
		System.out.println();
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
		*/
		
		// for normal
		for(int i=0; i < numeros.length; i++)
			/* System.out.println(numeros[i]);*/
			numeros[i] = 2 * numeros[i];
		
		// for-each (acessar cada elemento)
		for(int i : numeros)
			System.out.println(i);
		
		// criação de matriz
		/* int[][] matriz = new int[3][3]; */
		
	}

}
