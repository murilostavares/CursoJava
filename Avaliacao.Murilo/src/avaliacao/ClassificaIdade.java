package avaliacao;

import java.util.Scanner;

public class ClassificaIdade {

	public static void main(String[] args) {
		System.out.println("Vamos descobrir em qual categoria voc� se encaixa");

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = Integer.parseInt(teclado.nextLine());
		System.out.printf("Sua idade � %s anos. \n", idade);
		System.out.printf("");
		System.out.printf("Voc� se encaixa na categoria: ");
		System.out.printf("");

		if (idade >= 60) {
			System.out.println("IDOSO");
		} else if (idade >= 25) {
			System.out.println("ADULTO");
		} else if (idade >= 18) {
			System.out.println("JOVEM");
		} else if (idade >= 13) {
			System.out.println("ADOLESCENTE");
		} else if (idade < 9) {
			System.out.println("CRIAN�A");
		}

		teclado.close();

	}

}
