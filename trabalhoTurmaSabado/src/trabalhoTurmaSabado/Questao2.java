//Crie um programa que solicite  10 notas e as armazene em um array. Em seguida calcule a m�dia das notas e apresente todas as notas que possuem valor igual ou maior que a m�dia.

package trabalhoTurmaSabado;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner teclado = null;
		double nota[] = new double[10];
		double media = 0.0;
		int marcador = 0;

		System.out.println("Digite 10 notas para saber qual a m�dia, e quais notas est�o acima da m�dia.");
		System.out.println();

		for (; marcador < nota.length; marcador++) {
			System.out.println("Digite a nota numero " + (marcador + 1) + ":");
			teclado = new Scanner(System.in);
			nota[marcador] = Double.parseDouble(teclado.nextLine());

			media = media + nota[marcador];

		}

		media = media / nota.length;

		System.out.println("A m�dia das notas � " + media);
		System.out.println(" ");

		for (marcador = 0; marcador < nota.length; marcador++) {
			if (nota[marcador] > media)
				System.out.println("A nota n�mero " + (marcador + 1) + ": " + nota[marcador] + ", � maior que a m�dia.");

		}
		teclado.close();

	}

}
