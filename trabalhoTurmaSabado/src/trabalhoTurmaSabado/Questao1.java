//Crie um programa que leia o nome e as notas de 10 alunos, em seguida apresente o nome e a nota do aluno com a maior nota e do aluno com a menor nota. Os nomes e as notas devem ser armazenados em um array.

package trabalhoTurmaSabado;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		double nota[] = new double[10], notaMenor = 0.0, notaMaior = 0.0;
		String nome[] = new String[10], nomeMaior = null, nomeMenor = null;
		Scanner teclado = null;
		teclado = new Scanner(System.in);
		int marcador = 0;

		for (; marcador < nota.length; marcador++) {
			System.out.println("Digite o nome do aluno:");
			teclado = new Scanner(System.in);
			nome[marcador] = teclado.nextLine();

			System.out.println("Digite a nota deste aluno:");

			nota[marcador] = Double.parseDouble(teclado.nextLine());

			if (nota[marcador] > notaMaior) {
				notaMaior = nota[marcador];
				nomeMaior = nome[marcador];
			}
			if (notaMenor == 0.0) {
				notaMenor = nota[marcador];
				nomeMenor = nome[marcador];
			} else if (nota[marcador] < notaMenor) {
				notaMenor = nota[marcador];
				nomeMenor = nome[marcador];

			}

		}
		System.out.println();

		System.out.println("A maior nota é " + notaMaior + " do aluno " + nomeMaior + ".");
		System.out.println("A menor nota é " + notaMenor + " do aluno " + nomeMenor + ".");

		teclado.close();
	}

}
