// 01) Escreva um programa que solicite a idade do usuário e em seguida apresente o valor informado. Casoo usuário tenha digirado um valor negativo o progrma deve apresentar uma mensagem informando que o valor é inválido e deve solicitar a idade novamente.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class IdadeUsuario {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int idade = 0;

		do {
			System.out.println();
			System.out.println("Digite sua idade:");
			idade = Integer.parseInt(teclado.nextLine());
			if (idade > 0) {
				System.out.println("Sua idade é: " + idade);
			}

		} while (idade >= 0);

		System.out.println("Idade inválida.");
		System.out.println("Fim da Aplicação;");
		teclado.close();
	}
}
