package br.com.cursojava.aula004;

import java.util.Scanner;

public class MediaEMaiorQueMedia {

	public static void main(String[] args) {

		double[] notas = new double[10];
		Scanner teclado = null;
		double media = 0.0;

		for (int i = 0; i < notas.length; i++) {

			System.out.println("Digite uma nota:");
			teclado = new Scanner(System.in);
			notas[i] = Double.parseDouble(teclado.nextLine());
			media = media + notas[i];

		}

		media = (media / notas.length);

		System.out.println("");
		System.out.println("A média é: " + media);
		System.out.println("");

		int a = 0;
		while (a < notas.length) {
			if (notas[a] > media) {

				System.out.println("Nota " + (a + 1) + " é: " + notas[a] + ", e maior que a média.");
			}
			a++;

		}
		System.out.println("");

		teclado.close();

	}

}
