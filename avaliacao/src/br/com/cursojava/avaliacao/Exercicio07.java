package br.com.cursojava.avaliacao;
//Escreva um programa que solicite um n�mero e em seguida informe o valor do n�mero elevado a quinta potencia

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ol�, Digite o n�mero base, que deseja elevar a 5� pot�ncia:");
		double base = Double.parseDouble(teclado.nextLine());

		double resultado = Math.pow(base, 5);

		System.out.println("O n�mero informado, elevado a 5� pot�ncia, �:");
		System.out.println(resultado);

		teclado.close();
	}
}
