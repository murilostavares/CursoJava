package br.com.cursojava.avaliacao;
//Escreva um programa que solicite um número e em seguida informe o valor do número elevado a quinta potencia

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá, Digite o número base, que deseja elevar a 5ª potência:");
		double base = Double.parseDouble(teclado.nextLine());

		double resultado = Math.pow(base, 5);

		System.out.println("O número informado, elevado a 5ª potência, é:");
		System.out.println(resultado);

		teclado.close();
	}
}
