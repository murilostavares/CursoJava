package avaliacao;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		System.out.println("Insira um n�mero para saber se ele � PAR ou IMPAR:");

		Scanner teclado = new Scanner(System.in);
		int valor = Integer.parseInt(teclado.nextLine());
		System.out.printf("O n�mero digitado foi %s. \n", valor);

		if ((valor % 2) != 0) {
			System.out.println("");
			System.out.println("SEU N�MERO � IMPAR!");
		} else {
			System.out.println("");
			System.out.println("SEU N�MERO � PAR!");
		}

		teclado.close();

	}
}
