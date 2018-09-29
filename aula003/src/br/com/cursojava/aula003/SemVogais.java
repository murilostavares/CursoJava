package br.com.cursojava.aula003;

import java.util.Scanner;

public class SemVogais {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá");
		System.out.println("Digite seu nome:");
		String nome = teclado.nextLine();

		String nome2 = nome.replace("a", "");
		nome2 = nome2.replace("e", "");
		nome2 = nome2.replace("i", "");
		nome2 = nome2.replace("o", "");
		nome2 = nome2.replace("u", "");
		nome2 = nome2.replace("A", "");
		nome2 = nome2.replace("E", "");
		nome2 = nome2.replace("I", "");
		nome2 = nome2.replace("O", "");
		nome2 = nome2.replace("U", "");
		nome2 = nome2.replace("á", "");
		nome2 = nome2.replace("Á", "");
		nome2 = nome2.replace("â", "");
		nome2 = nome2.replace("Â", "");
		nome2 = nome2.replace("à", "");
		nome2 = nome2.replace("À", "");
		nome2 = nome2.replace("é", "");
		nome2 = nome2.replace("É", "");
		nome2 = nome2.replace("ê", "");
		nome2 = nome2.replace("Ê", "");
		nome2 = nome2.replace("ã", "");
		nome2 = nome2.replace("Ã", "");
		nome2 = nome2.replace("í", "");
		nome2 = nome2.replace("Í", "");
		nome2 = nome2.replace("î", "");
		nome2 = nome2.replace("Î", "");
		nome2 = nome2.replace("ó", "");
		nome2 = nome2.replace("Ó", "");
		nome2 = nome2.replace("ô", "");
		nome2 = nome2.replace("Ô", "");
		nome2 = nome2.replace("õ", "");
		nome2 = nome2.replace("Õ", "");
		nome2 = nome2.replace("ú", "");
		nome2 = nome2.replace("Ú", "");
		nome2 = nome2.replace("ü", "");
		nome2 = nome2.replace("Ü", "");
		nome2 = nome2.replace("û", "");
		nome2 = nome2.replace("Û", "");

		System.out.println("");
		System.out.println("Seu nome sem vogais fica:");
		System.out.println(nome2);

		nome2 = nome2.replace(" ", "");

		System.out.println("");
		System.out.println("Seu nome sem vogais e sem espaços fica:");
		System.out.println(nome2);

		teclado.close();
		
		//Possível colocar da seguinte forma
		// String nome2 = nome.replaceAll("[aAeEiIoOuU]","");
		
		
	}

}
