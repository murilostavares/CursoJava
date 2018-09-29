package avaliacao;

import java.util.Scanner;

public class NomeInverso {
	public static void main(String[] args) {

		System.out.println("Digite seu nome para saber como ele fica escrito ao contrário:");
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		System.out.println("");
		System.out.printf("Seu nome é %s. \n", nome);
		teclado.close();
		int inverso = nome.length();
		int marcador = 0;

		while (nome.length() > -1) {
			String contrario;
			nome.charAt(inverso);
			
			contrario = "contrario + contrario";
			
			
			
			marcador = nome.length() - 1;
		}

		System.out.println(inverso);

	}

}
