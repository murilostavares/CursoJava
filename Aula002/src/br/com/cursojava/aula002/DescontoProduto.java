package br.com.cursojava.aula002;

import java.util.Scanner;

public class DescontoProduto {
	public static void main(String[] args) {
		System.out.println("Vamos calcular o valor do produto com desconto");

		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Insira o valor total dos produtos");
		double valorProduto = Double.parseDouble(teclado1.nextLine());
		
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Insira o percentual de desconto (Somente números)");
		double valorDesconto = Double.parseDouble(teclado2.nextLine());
		
		System.out.println("");
		System.out.println("O percentual de desconto é " +valorDesconto +"%");
	
		System.out.println("");
		System.out.println("O valor dos produtos com desconto é");

		valorDesconto = valorDesconto / 100.0;
		double valorDesconto2 = valorProduto * valorDesconto;
		valorProduto = valorProduto - valorDesconto2;

		System.out.println(valorProduto);

		teclado1.close();
		teclado2.close();

	}

}
	
