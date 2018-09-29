package avaliacao;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		System.out.println("Insira um número para saber se ele é PAR ou IMPAR:");

		Scanner teclado = new Scanner(System.in);
		int valor = Integer.parseInt(teclado.nextLine());
		System.out.printf("O número digitado foi %s. \n", valor);

		if ((valor % 2) != 0) {
			System.out.println("");
			System.out.println("SEU NÚMERO É IMPAR!");
		} else {
			System.out.println("");
			System.out.println("SEU NÚMERO É PAR!");
		}

		teclado.close();

	}
}
