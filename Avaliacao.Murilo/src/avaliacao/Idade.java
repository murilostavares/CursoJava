package avaliacao;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {

		System.out.println("Insira sua idade:");

		Scanner teclado = new Scanner(System.in);
		int valor = Integer.parseInt(teclado.nextLine());
		System.out.println("");
		System.out.printf("Sua idade é %s anos. \n", valor);
		System.out.printf("Sua idade em 20 anos, será %s anos. \n", (valor + 20));

		teclado.close();
	}

}
