package br.com.cursojava.aula003;

import java.util.Scanner;

public class RepitaJava {
	public static void main(String[] args) {

		int marcador = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá");
		System.out.println("Digite uma palavra");
		String nome = teclado.nextLine();

		while (marcador < nome.length()) {
			int col = 0;
			while (col++ <= marcador) {

				System.out.print(" " + nome);
			}
			marcador++;
			System.out.println(" ");
		}
		teclado.close();
	}

}
