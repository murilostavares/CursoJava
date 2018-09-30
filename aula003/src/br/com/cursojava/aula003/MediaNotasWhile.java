package br.com.cursojava.aula003;

import java.util.Scanner;

public class MediaNotasWhile {
	public static void main(String[] args) {

		double mark = 0.0,nota,nota1 = 0.0;
		Scanner teclado = null;

		while (mark <= 9) {
			System.out.println("Insira abaixo uma nota");

			teclado = new Scanner(System.in);
			nota = Double.parseDouble(teclado.nextLine());
			System.out.println("");

			nota1 = nota1+nota;
			
			mark++;
			
		}
		System.out.println("A média das notas inseridas é");
		System.out.println(nota1/10);
		teclado.close();
	}
	
}
