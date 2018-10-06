package br.com.cursojava.aula004;

public class ExemploVetor {
	public static void main(String[] args) {

		// Vetor é uma varíavel que consegue armazenar mais de um valor;

		// o que definde que a variavel é um array, é os conchetes
		int[] numeros = new int[3];
		String nomes[] = new String[5];
		// para substituir os dados é necessário criar um novo array;
		int[] notas = { 10, 9, 8 };
		String[] frutas = new String[] { "Banana", "Abacaxi", "Morango" };
		// definindo valores para os index:
		numeros[0] = 10;
		numeros[1] = 3;
		numeros[2] = 7;

		for (int i = 0; i < nomes.length; i++) {

			nomes[i] = "Nome " + (i + 1);

		}

		for (int i = 0; i < notas.length; i++) {
			int atual = notas[i];
			System.out.println(atual);

		}
		// for/it. Vai pegar sempre de forma subsequente a quantidade do array e
		// verificar.
		// for/it. Sempre vai ter que percorrer o array por completo.
		for (String atual : frutas) {
			System.out.println(atual);
		}
	}

}
