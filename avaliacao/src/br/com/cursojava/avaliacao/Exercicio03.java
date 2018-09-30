package br.com.cursojava.avaliacao;
//Escreva um programa que solicita uma palavra e em seguida apresente a palavra digitada de modo inverso

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Scanner teclado = null;
		teclado = new Scanner(System.in);

		System.out.println("Olá, Escreva seu nome, para ver como ele fica ao contrário:");
		String nome = teclado.nextLine();

		int mark = 0;
		int dot = nome.length();

		while (mark <= dot && dot != 0) {

			System.out.print(nome.substring(dot - 1, dot));

			dot--;
		}

		teclado.close();

	}

}
