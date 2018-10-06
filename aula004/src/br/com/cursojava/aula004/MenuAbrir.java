//02) Escreva um programa que apresente o menu abaixo at� que o usu�rio digite 'S';
//	A - abrir arquivo
//	B - Procurar arquivo
//	C - Download de arquivo
//	D - Upload de arquivo
//	S - Sair
//

package br.com.cursojava.aula004;

import java.util.Scanner;

public class MenuAbrir {
	public static void main(String[] arg) {

		Scanner teclado = new Scanner(System.in);
		String menu = null;

		do {
			System.out.println();
			System.out.println("A - Abrir arquivo");
			System.out.println("B - Procurar arquivo");
			System.out.println("C - Download arquivo");
			System.out.println("D - Upload arquivo");
			System.out.println("S - Sair");
			menu = teclado.nextLine();

			switch (menu) {
			// N�o pode esquecer as ASPAS;
			case "A":
				System.out.println("Abrir arquivo");
				break;
			case "a":
				System.out.println("Abrir arquivo");
				break;
			// N�o pode esquecer as ASPAS;
			case "B":
				System.out.println("Procurar arquivo");
				break;
			case "b":
				System.out.println("Procurar arquivo");
				break;
			// N�o pode esquecer as ASPAS;
			case "C":
				System.out.println("Download arquivo");
				break;
			case "c":
				System.out.println("Download arquivo");
				break;
			// N�o pode esquecer as ASPAS;
			case "D":
				System.out.println("Upload arquivo");
				break;
			case "d":
				System.out.println("Upload arquivo");
				break;
			// N�o pode esquecer as ASPAS;
			case "S":
				System.out.println("Sair");
				break;
			case "s":
				System.out.println("Sair");
				break;
			default:
				System.out.println("Op��o Invalida");
			}
			// �nico la�o que termina com ";"
		} while (!"s".equalsIgnoreCase(menu));

		System.out.println("Fim da Aplica��o");
		teclado.close();

	}

}
