package br.com.cursojava.aula002;

import java.util.Scanner;

public class AprovadoReprovado {
	public static void main (String[] args) {
		System.out.println("Insira 3 notas para que seja calculada a m�dia");
		
		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Insira a primeira nota");
		String nota1 = teclado1.nextLine();
		int notam1 = Integer.parseInt(nota1);
		System.out.printf("A primeira nota informada foi %s. \n",nota1);
		
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Insira a segunda nota");
		String nota2 = teclado2.nextLine();
		int notam2 = Integer.parseInt(nota2);
		System.out.printf("A segunda nota informada foi %s. \n",nota2);
		
		Scanner teclado3 = new Scanner(System.in);
		System.out.println("Insira a terceira nota");
		String nota3 = teclado3.nextLine();
		int notam3 = Integer.parseInt(nota3);
		System.out.printf("A terceira nota informada foi %s. \n",nota3);
		
		System.out.println("");
		
		System.out.println("A m�dia dos valores informados �:");
		
		double media = (notam1 + notam2 + notam3) / 3.0;
				
		System.out.println(media);
		
		if (media>=7){
			System.out.println("");
			System.out.println("VOC� ESTA APROVADO");
		}else {
			System.out.println("");
			System.out.println("VOC� ESTA REPROVADO");
		}
		
		
		
		teclado1.close();
		teclado2.close();
		teclado3.close();
		
		
		
		
		
	}
	

}
