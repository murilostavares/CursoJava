package br.com.cursojava.aula003;

import java.util.Scanner;

public class NomeUsuarioCaracteres {
	public static void main (String[] args){

		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Olá");
		System.out.println("Digite seu nome:");
		String nome = teclado.nextLine();
		
		
		System.out.printf("O nome %s possui %d caracteres, incluindo os espaços. \n", nome, nome.length());
		nome = nome.replace(" ", "");
		System.out.printf("O nome %s possui %d caracteres, desconsiderando os espaços. \n", nome, nome.length());
		
		
		teclado.close();
		
	}
}
