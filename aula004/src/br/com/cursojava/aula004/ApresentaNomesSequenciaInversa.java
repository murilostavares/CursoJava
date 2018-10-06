//10) Escreva um programa que solicite 5 nomes e após solicitar o último nome, apresente todos os nomes digitados na sequencia inversa (ultimo nome deve ser o primeiro, penúltimo, deve ser o segundo, etc, primeiro deve ser o último).

package br.com.cursojava.aula004;

import java.util.Scanner;

public class ApresentaNomesSequenciaInversa {

	public static void main(String[] args) {

		String[] nomes = new String[5];
		Scanner teclado = null;

		for (int i = 0; i < nomes.length; i++) {

			System.out.println("Digite um nome:");
			teclado = new Scanner(System.in);
			nomes[i] = teclado.nextLine();

		}
		int a = nomes.length - 1;
		while (a >= 0) {

			System.out.println(nomes[a]);

			a--;
		}

		teclado.close();

	}
}
