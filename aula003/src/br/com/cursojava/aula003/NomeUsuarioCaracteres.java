package br.com.cursojava.aula003;

import java.util.Scanner;

public class NomeUsuarioCaracteres {
	public static void main (String[] args){

		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Ol�");
		System.out.println("Digite seu nome:");
		String nome = teclado.nextLine();
		
		
		System.out.printf("O nome %s possui %d caracteres, incluindo os espa�os. \n", nome, nome.length());
		nome = nome.replace(" ", "");
		System.out.printf("O nome %s possui %d caracteres, desconsiderando os espa�os. \n", nome, nome.length());
		
		
		teclado.close();
		
	}
}
