package br.com.cursojava.aula002;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
		System.out.println("Vamos calcular seu IMC");

		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Insira sua altura, em m (somente n�meros)");
		double altura = Double.parseDouble(teclado1.nextLine());
		System.out.printf("A altura informada foi %s m. \n", altura);

		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Insira seu peso, em kg (somente n�meros)");
		double peso = Double.parseDouble(teclado2.nextLine());
		System.out.printf("O peso informado foi %s kg. \n", peso);

		System.out.println("");
		System.out.println("O seu IMC �:");


		
		double imc = (peso / (altura*altura));

		System.out.println(imc);

		teclado1.close();
		teclado2.close();

	}

}