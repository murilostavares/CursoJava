package avaliacao;

import java.util.Scanner;

public class NomeInverso {
	public static void main(String[] args) {

		Scanner teclado = null;
		teclado = new Scanner(System.in);

		System.out.println("Ol�, Escreva seu nome, para ver como ele fica ao contr�rio:");
		String nome = teclado.nextLine();

		int mark = 0;
		int dot = nome.length();

		while (mark <= dot && dot != 0) {

			System.out.print(nome.substring(dot - 1, dot));

			dot--;
		}

		teclado.close();
	}

}
