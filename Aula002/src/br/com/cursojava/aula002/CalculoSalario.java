package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalculoSalario {
	public static void main(String[] args) {
		System.out.println("Vamos decobrir como fica o valor l�quido do seu sal�rio, descontando INSS e IR");

		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Digite seu sal�rio:");
		double salario = Double.parseDouble(teclado1.nextLine());
		double inss = (11.0 / 100);
		double irenda = 1;

		if (salario >= 1800.00 && salario < 2300.00) {
			irenda = (7.5 / 100);
		} else if (salario >= 2300.00 && salario < 3600.00) {
			irenda = (24.0 / 100);
		} else if (salario >= 3600.00) {
			irenda = (32.0 / 100);
		}

		double liquido = ((salario * inss)+(salario*irenda));
		liquido = salario - liquido;

		if (irenda == 1) {
			irenda = 0;
		}

		System.out.printf("");
		System.out.printf("Seu sal�rio bruto �: ");
		System.out.printf("");
		System.out.printf("sal�rio  %s. \n", salario);
		System.out.printf("");
		System.out.printf("INSS  %s %s \n", (inss * 100), "%");
		System.out.printf("IR  %s %s \n", (irenda * 100), "%");
		System.out.printf("Seu sal�rio �  %s. \n", liquido);

		teclado1.close();

	}

}
