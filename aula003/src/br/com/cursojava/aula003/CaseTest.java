package br.com.cursojava.aula003;

import java.util.Scanner;

public class CaseTest {
	public static void main(String[] args) {

		
		System.out.println("Qual dia � hoje?");

		Scanner teclado = new Scanner(System.in);
		int dia = Integer.parseInt(teclado.nextLine());
		System.out.println("");		
		

		switch (dia) {

		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Ter�a-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("N�mero inv�lido");
			break;

		}

		teclado.close();

	}

}
