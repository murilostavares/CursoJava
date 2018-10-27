package aula05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Crie um programa que solicite 3 notas de 5 alunos e em seguida calcule a
		// média das notas de cada aluno. O progranma deve apresentar as notas dos
		// alunos seguidada média do aluno. Utilize uma matriz para armazenar as notas
		// dos alunos e um array para armazenas as médias

		double[][] lista = new double[5][3];
		Scanner teclado = new Scanner(System.in);
		double media[] = new double[5];
		double total = 0;
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				System.out.println("Informe a " + (j + 1) + "ª nota do " + (i + 1) + "º aluno");
				lista[i][j] = Double.parseDouble(teclado.nextLine());
				total = lista[i][j];
			}
			media[i] += total;
			total = 0;
		}
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Notas do " + (i + 1) + "º aluno: ");
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print(lista[i][j] + ", ");
			}
			 System.out.println("Média do aluno: "+ media[i]);
			System.out.println();
		}

		teclado.close();
		teclado.close();
	}

}
