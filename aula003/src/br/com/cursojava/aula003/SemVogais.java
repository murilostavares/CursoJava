package br.com.cursojava.aula003;

import java.util.Scanner;

public class SemVogais {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ol�");
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
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");
		nome2 = nome2.replace("�", "");

		System.out.println("");
		System.out.println("Seu nome sem vogais fica:");
		System.out.println(nome2);

		nome2 = nome2.replace(" ", "");

		System.out.println("");
		System.out.println("Seu nome sem vogais e sem espa�os fica:");
		System.out.println(nome2);

		teclado.close();
		
		//Poss�vel colocar da seguinte forma
		// String nome2 = nome.replaceAll("[aAeEiIoOuU]","");
		
		
	}

}
