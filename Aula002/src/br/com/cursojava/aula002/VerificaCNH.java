package br.com.cursojava.aula002;

import java.util.Scanner;

public class VerificaCNH {
	public static void main(String[] args) {
		System.out.println("Voc� pode tirar a CNH? Qual sua idade?");

		Scanner teclado1 = new Scanner(System.in);
		int idade = Integer.parseInt(teclado1.nextLine());
		System.out.println("");
		System.out.printf("A idade informada foi %s anos. \n", idade);

		if (idade >= 18) {
			System.out.println("");
			System.out.println("VOC� TEM IDADE PARA TIRAR SUA CNH. PARAB�NS!");
		} else {
			System.out.println("");
			System.out.println("VOC� AINDA N�O TEM IDADE PARA TIRAR SUA CNH");
			System.out.println("AGUARDE MAIS " + (-(idade - 18)) + " ANOS.");

		}

		teclado1.close();
	}

}
