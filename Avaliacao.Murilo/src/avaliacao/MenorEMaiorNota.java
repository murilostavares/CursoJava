package avaliacao;

import java.util.Scanner;

public class MenorEMaiorNota {

	public static void main(String[] args) {

		Scanner teclado = null;
		int count = 1;
		double min = 0;
		double max = 0;

		while (count <= 10) {
			System.out.println("Insira uma nota:");
			teclado = new Scanner(System.in);
			double nota = Double.parseDouble(teclado.nextLine());
			System.out.println("");

			max = (nota >= max) ? nota : max;
			min = (nota < min) ? nota : max;

			count++;
		}

		System.out.println("A menor nota foi");
		System.out.println(min);
		System.out.println("");
		System.out.println("A maior nota foi");
		System.out.println(max);
	}
}
