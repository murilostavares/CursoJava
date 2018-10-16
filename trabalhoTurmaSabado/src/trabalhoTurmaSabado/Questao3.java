//Crie um programa que solicite 10 notas e as armazene em um array. Em seguida crie dois novos arrays onde o primeiro deve conter as notas menores que a média e o segundo deve conter as notas maiores ou iguais a média. Os Arrays auxiliares(que armazena as notas divididas) devem possuir um tamanho exatamente igual a quantidade a ser armazenada em cada um. (Se tiver 5 notas maiores ou iguais a média então os array auxiliares deverão ser respectivamente de tamanho 3 e 7).

package trabalhoTurmaSabado;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int m0 = 0, m1 = 0, m2 = 0, m3 = 0, m4 = 0;
		double nota[] = new double[10], media = 0;

		for (; m0 < nota.length; m0++) {
			System.out.println("Informe a " + (m0 + 1) + "ª nota:");
			nota[m0] = Double.parseDouble(teclado.nextLine());

			media = media + nota[m0];

		}

		media = media / nota.length;

		for (m0 = 0; m0 < nota.length; m0++) {
			if (nota[m0] >= media)
				m1++;
			else
				m2++;
		}

		double notaMaior[] = new double[m1], notaMenor[] = new double[m2];

		for (m0 = 0; m0 < nota.length; m0++) {
			if (nota[m0] < media) {
				notaMenor[m4] = nota[m0];
				m4++;
			}

		}

		for (m0 = 0; m0 < nota.length; m0++) {
			if (nota[m0] >= media) {
				notaMaior[m3] = nota[m0];
				m3++;
			}

		}

		System.out.println("A quanitdade de notas menor que a média é: " + notaMenor.length);
		System.out.println("A quanitdade de notas menor que a média é: " + notaMaior.length);
		System.out.println();
		System.out.println("As notas menores que a média são:");

		for (m0 = 0; m0 < notaMenor.length; m0++) {
			System.out.print(notaMenor[m0] + "; ");
		}
		System.out.println();
		System.out.println();
		System.out.println("As notas maiores que a média são:");

		for (m0 = 0; m0 < notaMaior.length; m0++) {
			System.out.print(notaMaior[m0] + "; ");
		}

		teclado.close();
	}

}
