package br.com.cursojava.avaliacao;
//Escreva um programa que calcula a soma dos primeiros 50 n�meros inteiros

public class Exercicio04 {
	public static void main(String[] args) {
		System.out.println("Vamos verificar a soma dos primeiros 50 n�meros inteiros.");
		System.out.println("");

		int numero = 0;
		int count = 1;

		while (count <= 50) {
			numero = numero + count;

			count++;

		}

		System.out.println("A soma de todos os n�meros inteiros de 1 a 50 �:");
		System.out.println(numero);

	}

}
