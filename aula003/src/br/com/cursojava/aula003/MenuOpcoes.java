package br.com.cursojava.aula003;

import java.util.Scanner;

public class MenuOpcoes {
	public static void main(String[] args) {

		System.out.println("OPÇÕES");

		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Listar Produtos");
		System.out.println("3 - Pesquisar Produtos");
		System.out.println("4 - Remover Produto");
		System.out.println("5 - Sair");
		System.out.println("");
		System.out.println("Digite a Opção Desejada:");
		System.out.println("");

		Scanner teclado = new Scanner(System.in);
		int opcao = Integer.parseInt(teclado.nextLine());
		System.out.println("");

		switch (opcao) {

		case 1:
			System.out.println("Você escolheu a opção Cadastrar Produto");
			break;
		case 2:
			System.out.println("Você escolheu a opção Lisar Produtos");
			break;
		case 3:
			System.out.println("Você escolheu a opção Pesquisar Produtos");
			break;
		case 4:
			System.out.println("Você escolheu a Opção Remover Produto");
			break;
		case 5:
			System.out.println("Obrigado por usar nossos terminais de atnedimento");
			break;
		default:
			System.out.println("Opção Invalida");
			break;

		}

		teclado.close();

	}

}
