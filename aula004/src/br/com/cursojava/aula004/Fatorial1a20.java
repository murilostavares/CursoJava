//06) Escreva um programa que solicite um número entre 1 e 20, e em seguida apresente o valor do fatorial do número informado. O programa deve validar os númermos informados solicitando um número correto sempre que o usuário informar um valor fora do range. (Usitilize do/while e for)

package br.com.cursojava.aula004;

import java.util.Scanner;

public class Fatorial1a20 {

	public static void main(String[] args) {

		int fat = 1;
		int i = 2;
		int valor = 0;
		Scanner teclado = null;

		do {
			System.out.println("Escreva um número de 1 a 20:");
			System.out.println("Será apresentado o fatorial");

			teclado = new Scanner(System.in);
			valor = Integer.parseInt(teclado.nextLine());

			if (valor < 1 || valor > 20) {

				System.out.println("Número fora do range");
			}
		} while (valor < 1 || valor > 20);

		for (; i <= valor; i++) {

			fat = fat * i;
		}
		System.out.println("O fatorial de " + valor + " é igual a " + fat);
		teclado.close();
	}

}
