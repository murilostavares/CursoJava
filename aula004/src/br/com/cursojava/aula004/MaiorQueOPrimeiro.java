//07) Escreva um programa que solicite dois números ao usuário, onde o segundo número deve ser maior que o primeiro. Em seguida escreva os números contidos entre o primeiro e o segundo número digitado.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class MaiorQueOPrimeiro {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Escreva 2 números, onde o primeiro deve ser menor que o segundo.");
		System.out.println("");

		System.out.println("Escreva o primeiro número:");
		int n1 = Integer.parseInt(teclado.nextLine());
		int n2 = 0;

		do {
			System.out.println("Escreva o segundo número:");
			n2 = Integer.parseInt(teclado.nextLine());

			if (n2 < n1) {
				for (; n2 < n1;) {
					System.out.println("Número menor que o primeiro, digite novamente");
					System.out.println("");
					break;
				}
			} else if (n2 == n1) {
				System.out.println("Número igual ao primeiro, digite novamente:");
				System.out.println("");
			}

		} while (n2 <= n1);

		System.out.println("Ok! " + n1 + " é menor que " + n2 + "!");

		teclado.close();

	}
}
