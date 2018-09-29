package br.com.cursojava.aula003;

import java.util.Scanner;

public class UltimaPalavraFrase {
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá");
		System.out.println("Digite uma frase:");
		String nome = teclado.nextLine();
		
		int nome3 = nome.lastIndexOf(" ");
		String nome2 = nome.substring(nome3+1);
		
		System.out.println(nome2);
		
		teclado.close();
	}

	
	

}
