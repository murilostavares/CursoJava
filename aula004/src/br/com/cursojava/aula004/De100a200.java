//04) Escreva um programa que apresente os números pares entre 100 e 200.

package br.com.cursojava.aula004;

public class De100a200 {

	public static void main(String[] args) {

		for (int n = 100; n <= 200; n++) {

			if (n % 2 == 0) {
				System.out.print(n + " ");
			} else {
				continue;
			}

		}

	}

}
