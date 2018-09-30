package br.com.cursojava.avaliacao;
//Escreva um programa que solicita a idade do usu�rio e o classifica de acordo com a tabela abaixo

//0 a 12 - crian�a - 13 a 17 - adolescente - 18 a 24 - jovem - 25 a 59 - adulto - 60 ou mais - idoso

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		System.out.println("Vamos descobrir em qual categoria voc� se encaixa");

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = Integer.parseInt(teclado.nextLine());
		System.out.printf("Sua idade � %s anos. \n", idade);
		System.out.printf("");
		System.out.printf("Voc� se encaixa na categoria: ");
		System.out.printf("");

		if (idade >= 60) {
			System.out.println("IDOSO");
		} else if (idade >= 25) {
			System.out.println("ADULTO");
		} else if (idade >= 18) {
			System.out.println("JOVEM");
		} else if (idade >= 13) {
			System.out.println("ADOLESCENTE");
		} else if (idade < 9) {
			System.out.println("CRIAN�A");
		}

		teclado.close();

	}
}