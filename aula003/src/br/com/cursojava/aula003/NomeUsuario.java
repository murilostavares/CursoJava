package br.com.cursojava.aula003;

import java.util.Scanner;

public class NomeUsuario {

	public static void main(String[] args) {

		int nome1 = 1;

		while (nome1 != 0) {

			System.out.println("Olá");
			System.out.println("Digite seu nome:");
			Scanner teclado = new Scanner(System.in);
			String nome = teclado.nextLine();

			nome1 = nome.length();
			
			
		}

	}
}