package br.com.cursojava.aula003;

import java.util.Scanner;

public class VotarOuNao {
	public static void main(String[] args) {
		System.out.println("Vamos verificiar se você já pode votar");
		System.out.println("");

		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Qual sua idade?");
		String idade1 = teclado1.nextLine();
		int idade = Integer.parseInt(idade1);
		System.out.printf("Sua idade é %s. \n", idade1);

		System.out.println("");

		String voto = idade >= 18 ? "já pode votar!" : "não pode votar ainda!";

		System.out.println("Você " + voto);

		teclado1.close();
	}

}
