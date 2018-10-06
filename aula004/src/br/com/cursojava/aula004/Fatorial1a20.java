//06) Escreva um programa que solicite um n�mero entre 1 e 20, e em seguida apresente o valor do fatorial do n�mero informado. O programa deve validar os n�mermos informados solicitando um n�mero correto sempre que o usu�rio informar um valor fora do range. (Usitilize do/while e for)

package br.com.cursojava.aula004;

import java.util.Scanner;

public class Fatorial1a20 {

	public static void main(String[] args) {

		int fat = 1;
		int i = 2;
		int valor = 0;
		Scanner teclado = null;

		do {
			System.out.println("Escreva um n�mero de 1 a 20:");
			System.out.println("Ser� apresentado o fatorial");

			teclado = new Scanner(System.in);
			valor = Integer.parseInt(teclado.nextLine());

			if (valor < 1 || valor > 20) {

				System.out.println("N�mero fora do range");
			}
		} while (valor < 1 || valor > 20);

		for (; i <= valor; i++) {

			fat = fat * i;
		}
		System.out.println("O fatorial de " + valor + " � igual a " + fat);
		teclado.close();
	}

}
