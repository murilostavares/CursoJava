package br.com.cursojava.aula003;

import java.util.Scanner;

public class PrimeiraPalavraFrase {
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá");
		System.out.println("Digite uma frase:");
		String nome = teclado.nextLine();
		
		String[] nome2 = nome.split(" ");
		
		if (nome2[0].length() <= 1){
		System.out.println("");
		System.out.println("A primeira palavra da sua frase é (Ignorando artigos)");
		System.out.println(nome2[1]);
		}else{
			
		
		System.out.println("");
		System.out.println("A primeira palavra da sua frase é");
		System.out.println(nome2[0]);	
		}
		
		
		teclado.close();
	}

}
