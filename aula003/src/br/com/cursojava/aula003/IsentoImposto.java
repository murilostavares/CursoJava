package br.com.cursojava.aula003;

import java.util.Scanner;

public class IsentoImposto {
	public static void main(String[] args) {
		System.out.println("Vamos verificiar se você é isento de imposto de renda");
		System.out.println("");

		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Qual seu salário?");
		String salario1 = teclado1.nextLine();
		System.out.printf("Seu salário é %s. \n", salario1);

		System.out.println("");

		double salario = 0;
		
		String isento = salario >= 1800 ? "não é isento de IR!" : "é isento de IR!";

		System.out.println("Você " + isento);

		teclado1.close();
	}

}

