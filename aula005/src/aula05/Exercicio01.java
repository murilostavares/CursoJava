package aula05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Crie um programa que solicite 3 notas de 5 alunos e em seguida apresente as
		// notas cadastradas. As notas dos alunos deven ser impressas agrupadas linha a
		// linha. (Cada aluno deve ter todas as notas apresentadas na mesma linha e deve
		// possuir uma linha para cada aluno) Armazene as notas em uma matriz.

		double[][] lista = new double[5][3];
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				System.out.println("Informe a " + (j + 1) + "ª nota do " + (i + 1) + "º aluno");
				lista[i][j] = Double.parseDouble(teclado.nextLine());
			}
		}

		for (int i = 0; i < lista.length; i++) {
			System.out.print("Notas do " + (i + 1) + "º aluno: ");
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print(lista[i][j] + ", ");
			}
			System.out.println();
		}

		teclado.close();
	}

}
