package br.com.cursojava.avaliacao;

import java.util.Scanner;

//Escreva um programa que solicite um n�mero e informe se o n�mero � par ou impar 

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um n�mero para saber se � PAR ou IMPAR:");
		int numero = Integer.parseInt(teclado.nextLine());

		if (numero % 2 == 0)
			System.out.println("O n�mero � PAR.");
		else
			System.out.println("O n�mero � IMPAR.");

		teclado.close();
	}
}
