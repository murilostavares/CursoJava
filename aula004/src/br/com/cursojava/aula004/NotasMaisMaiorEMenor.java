//11) Escreva um programa que solicite 10 notas e em seguida apresente as notas informadas juntamente com a maior e a menor nota.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class NotasMaisMaiorEMenor {

	public static void main(String[] args) {

		int[] notas = new int[10];
		Scanner teclado = null;
		int[] maiormenor = new int[2];

		for (int i = 0; i < notas.length; i++) {

			System.out.println("Digite uma nota:");
			teclado = new Scanner(System.in);
			notas[i] = Integer.parseInt(teclado.nextLine());

			if (notas[i] > maiormenor[0]) {
				maiormenor[0] = notas[i];
			}
			if (maiormenor[1] == 0) {
				maiormenor[1] = maiormenor[0];
			} else if (notas[i] < maiormenor[1])
				maiormenor[1] = notas[i];

		}
		int a = 0;
		while (a < notas.length) {

			System.out.println("Nota " + (a + 1) + " é: " + notas[a]);

			a++;
		}
		System.out.println("");
		System.out.println("A maior nota foi " + maiormenor[0] + " .");
		System.out.println("A menor nota foi " + maiormenor[1] + " .");
		teclado.close();

	}

}
