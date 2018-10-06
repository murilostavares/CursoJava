// 03) Escreva um programa que solicite uma palavra e em seguida apresente a palavra de modo inverso (de trás para frente). Utilize o comando do/while para criar a palavra no modo inverso.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class InversoDoWhile {
	public static void main(String[] args) {

		Scanner teclado = null;
		teclado = new Scanner(System.in);

		System.out.println("Olá, Escreva uma palavra, para ver como ela fica ao contrário:");
		String nome = teclado.nextLine();

		int mark = 0;
		int dot = nome.length();

		do {

			System.out.print(nome.substring(dot - 1, dot));

			dot--;

		}

		while (mark <= dot && dot != 0);

		teclado.close();

	}

}
