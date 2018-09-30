package br.com.cursojava.avaliacao;

//Escreva um programa que calcule e escreva os números primos entre 1 e 50
public class Exercicio08 {

	public static void main(String[] args) {
		System.out.println("Vamos verificar todos os números primos de 1 a 50.");
		System.out.println("");

		int count = 1;

		while (count <= 50) {

			if (count == 2 || count == 3 || count == 5 || count == 7) {

				System.out.println(count);

			} else if (count % 2 == 0 || count % 3 == 0 || count % 5 == 0 || count % 7 == 0) {
			} else if (count != 1) {

				System.out.println(count);

			}

			count++;
		}
	}

}
