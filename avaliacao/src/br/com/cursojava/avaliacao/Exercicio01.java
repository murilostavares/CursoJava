package br.com.cursojava.avaliacao;

import java.util.Scanner;

//Escreva um programa que solicite um número e informe se o número é par ou impar 

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um número para saber se é PAR ou IMPAR:");
		int numero = Integer.parseInt(teclado.nextLine());

		if (numero % 2 == 0)
			System.out.println("O número é PAR.");
		else
			System.out.println("O número é IMPAR.");

		teclado.close();
	}
}
