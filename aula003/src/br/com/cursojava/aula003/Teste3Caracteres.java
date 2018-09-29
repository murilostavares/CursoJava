package br.com.cursojava.aula003;

import java.util.Scanner;

public class Teste3Caracteres {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá");
		System.out.println("Digite seu nome:");
		String nome = teclado.nextLine();

		
		String nome2 = nome.trim();
		
		if (nome2.length() <= 3){
		System.out.println("Nome Inválido");
		}
		else{
		System.out.println("Bem Vindo " + nome.trim() + " !");
		}
		
		teclado.close();

	}

}
