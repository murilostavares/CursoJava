//09) Escreva um programa que solicite 5 notas e após solicitar ultima nota, apresente todas as notas digitadas.


package br.com.cursojava.aula004;

import java.util.Scanner;

public class NotasDigitadas {

	public static void main(String[] args) {

		int[] notas = new int[5];
		Scanner teclado = null;

		for (int i = 0; i < notas.length; i++) {

			System.out.println("Digite uma nota:");
			teclado = new Scanner(System.in);
			notas[i] = Integer.parseInt(teclado.nextLine());

		}
		int a = 0;
		while (a < notas.length) {

			System.out.println("Nota " + (a + 1) + " é: " + notas[a]);

			a++;
		}

		teclado.close();
	}

}
