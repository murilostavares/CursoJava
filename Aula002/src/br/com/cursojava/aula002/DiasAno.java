package br.com.cursojava.aula002;

import java.util.Scanner;

public class DiasAno {
	public static void main(String[] args) {
		System.out.println("Vamos quantos dias de vida voc� viveu");

		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Quantos anos voc� tem?");
		int anos = Integer.parseInt(teclado1.nextLine());
		
		int dias = anos * 365;
		
		
		System.out.println("");
		System.out.println("Voc� j� viveu: " +dias +" dias");


		teclado1.close();
		

	}

}