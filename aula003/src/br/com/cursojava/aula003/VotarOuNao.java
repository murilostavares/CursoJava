package br.com.cursojava.aula003;

import java.util.Scanner;

public class VotarOuNao {
	public static void main(String[] args) {
		System.out.println("Vamos verificiar se voc� j� pode votar");
		System.out.println("");

		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Qual sua idade?");
		String idade1 = teclado1.nextLine();
		int idade = Integer.parseInt(idade1);
		System.out.printf("Sua idade � %s. \n", idade1);

		System.out.println("");

		String voto = idade >= 18 ? "j� pode votar!" : "n�o pode votar ainda!";

		System.out.println("Voc� " + voto);

		teclado1.close();
	}

}
