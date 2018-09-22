package br.com.cursojava.aula002;

import java.util.Scanner;

public class ElevarPotencia {
	public static void main(String[] args) {
		System.out.println("Vamos calcular um n�mero elevado a sua pot�ncia");

		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Insira o numero base:");
		int base = Integer.parseInt(teclado1.nextLine());

		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Insira o expoente:");
		int expoente = Integer.parseInt(teclado2.nextLine());

		System.out.println("");
		System.out.println("O n�mero "+base + " elevado a "+expoente+" �:");
		
		double potencia = Math.pow(base, expoente);
		
		System.out.println(potencia);

		teclado1.close();
		teclado2.close();

	}

}
