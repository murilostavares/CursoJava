package br.com.cursojava.aula007.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

	public static void menu() {

		System.out.println("####   MENU   #####");
		System.out.println("Digite uma Op��o");
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Listar Produto");
		System.out.println("3 - Remover Produto");
		System.out.println("4 - Sair");
		System.out.println("");

		Scanner tc = new Scanner(System.in);
		int menu = Integer.parseInt(tc.nextLine());
		int i = 0;

		List<Integer> prods = new ArrayList<>();

		do {
			switch (menu) {
			case 1:
				System.out.println("####   CADASTRAR PRODUTO   #####");
				System.out.println("");

				System.out.println("Digite o nome");
				String n = tc.nextLine();
				System.out.println("Digite a descri��o");
				String d = tc.nextLine();
				System.out.println("Digite o pre�o");

				double p = Double.parseDouble(tc.nextLine());

				new Produto(i, n, d, p);

				prods.add(i);

				break;
			case 2:
				System.out.println("####   LISTAR PRODUTOS   #####");
				System.out.println("");
				System.out.println(prods);

				break;
			case 3:
				System.out.println("####   REMOVER PRODUTOS   #####");
				System.out.println("");
				System.out.println("Digite o ID que deseja remover");
				int r = Integer.parseInt(tc.nextLine());
				prods.remove(r);

				break;
			case 4:
				System.out.println("####   SAIR   #####");
				break;
			default:
				System.out.println("####   OP��O INVALIDA   #####");
			}

			Menu.menu();

		} while (menu != 1 || menu != 2 || menu != 3);

		tc.close();

	}
}
