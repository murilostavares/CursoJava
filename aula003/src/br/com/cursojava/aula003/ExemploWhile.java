package br.com.cursojava.aula003;

public class ExemploWhile {
	public static void main(String[] args) {

		// while = enquanto (la�o)
		// express�o � qualquer coisa que retorne um resultado boolean
		// importante sempre lembrar de atualizar a express�o

		int numero = 1;

		while (numero <= 10) {
			if (numero < 10) {
				System.out.print(numero + ", ");
				numero++;
			} else {
				System.out.print(numero + ".");
				numero++;

			}

		}

	}

}
