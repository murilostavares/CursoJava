//05) Escreva um programa que apresente o resultado da soma dos 50 primeiros números inteiros positivos (Utilizando o for)

package br.com.cursojava.aula004;

public class Soma50Numeros {

	public static void main(String[] args) {

		int i = 0;

		
		System.out.println("A soma dos números de 1 a 50 é:");
		
		for (int n = 1; n <= 50; n++) {

			i = n + i;

		}
		
		System.out.println(i);

	}

}
