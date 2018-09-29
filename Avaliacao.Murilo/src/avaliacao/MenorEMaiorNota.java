package avaliacao;

import java.util.Scanner;

public class MenorEMaiorNota {

	public static void main(String[] args) {

		int count = 1;
		double max = 0;
		double min = 999999;

		while (count <= 10) {
			System.out.println("Insira uma nota:");
			Scanner teclado = new Scanner(System.in);
			double nota = Integer.parseInt(teclado.nextLine());
			System.out.println("");
			

			
			switch (count) {

			case 1:
				double n1 = nota;
				min = Math.min(min, n1);
				break;
			case 2:
				double n2 = nota;
				min = Math.min(n1, n2);
				break;
			case 3:
				double n3 = nota;
				min = Math.min(n2, n3);
				break;
			case 4:
				double n4 = nota;
				min = Math.min(n3, n4);
				break;
			case 5:
				double n5 = nota;
				min = Math.min(n4, n5);
				break;
			case 6:
				double n6 = nota;
				min = Math.min(n5, n6);
				break;
			case 7:
				double n7 = nota;
				min = Math.min(n6, n7);
			case 8:
				double n8 = nota;
				min = Math.min(n7, n8);
			case 9:
				double n9 = nota;
				min = Math.min(n8, n9);
			case 10:
				double n10 = nota;
				min = Math.min(n9, n10);
				break;
			default:
				System.out.println("ERRO");
				break;

			}

			count++;
		}

		
		System.out.println("A menor nota foi");
		System.out.println(min);
		System.out.println("");
		System.out.println("A maior nota foi");
		System.out.println(max);
		
	}
}
