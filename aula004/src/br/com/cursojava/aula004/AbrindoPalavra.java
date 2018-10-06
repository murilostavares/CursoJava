//08) Escreva um programa que solicite uma palavra ao usuário e em seguida escreva a palavra conforme o exemplo abaixo. (Utilize o comando for)
//Ex: palavra = "Brasil"
//
//B
//Br
//Bra
//Bras
//Brasi
//Brasil

package br.com.cursojava.aula004;

import java.util.Scanner;

public class AbrindoPalavra {

	public static void main(String[] args) {

		System.out.println("Escreva uma palavra e veja como ela fica:");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		int n = 0;

		for (; n < nome.length(); n++) {

			System.out.println(nome.substring(0, n + 1));

		}

		teclado.close();

	}

}
