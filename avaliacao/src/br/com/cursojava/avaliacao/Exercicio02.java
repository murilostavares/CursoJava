package br.com.cursojava.avaliacao;
//Escreva um programa que solicite ao usu�rio a sua idade e em seguida apresente o valor da idade do usu�rio ap�s 20 anos

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade para saber com quantos anos estar� daqui 20 anos:");
		int idade = Integer.parseInt(teclado.nextLine());

		System.out.printf("Sua idade �: %s anos. \n", idade);
		System.out.printf("Sua idade daqui 20 anos ser�: %s anos.", idade + 20);

		teclado.close();
	}
}
