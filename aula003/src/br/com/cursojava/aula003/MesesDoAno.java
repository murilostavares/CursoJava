package br.com.cursojava.aula003;

import java.util.Scanner;

public class MesesDoAno {
	public static void main(String[] args) {

		System.out.println("Qual o mês atual? (Número):");

		Scanner teclado = new Scanner(System.in);
		int mes = Integer.parseInt(teclado.nextLine());
		System.out.println("");


		String mes1 = "O mês atual é ";
		
		
		switch (mes) {

		case 1:
			System.out.println(mes1 + "Janeiro");
			break;
		case 2:
			System.out.println(mes1 + "Fevereiro");
			break;
		case 3:
			System.out.println(mes1 + "Março");
			break;
		case 4:
			System.out.println(mes1 + "Abril");
			break;
		case 5:
			System.out.println(mes1 + "Maio");
			break;
		case 6:
			System.out.println(mes1 + "Junho");
			break;
		case 7:
			System.out.println(mes1 + "Julho");
			break;
		case 8:
			System.out.println(mes1 + "Agosto");
			break;
		case 9:
			System.out.println(mes1 + "Setembro");
			break;
		case 10:
			System.out.println(mes1 + "Outubro");
			break;
		case 11:
			System.out.println(mes1 + "Novembro");
			break;
		case 12:
			System.out.println(mes1 + "Dezembro");
			break;
		default:
			System.out.println("Opção Invalida");
			break;

		}

		teclado.close();

	}


}
