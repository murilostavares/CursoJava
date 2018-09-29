package br.com.cursojava.aula003;

import java.util.Scanner;

public class PossuiLOuNao {
	public static void main (String[] args){
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá");
		System.out.println("Digite uma palavra:");
		String nome = teclado.nextLine();
		
		int nome2 = nome.indexOf("L");
		nome2 = nome.indexOf("l");
		
		System.out.println("");
		System.out.println("Seu nome sem vogais fica:");
		System.out.println(nome2);
		
		
		
		teclado.close();
	}
	
	

}
		
		
		
