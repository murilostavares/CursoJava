package avaliacao;

public class SomaNumerosInteiros {

	public static void main(String[] args) {

		System.out.println("Vamos verificar a soma dos primeiros 50 n�meros inteiros.");
		System.out.println("");

		int numero = 0;
		int count = 1;

		while (count <= 50) {
			numero = numero + count;

			count++;

		}

		System.out.println("A soma de todos os n�meros inteiros de 1 a 50 �:");
		System.out.println(numero);

	}

}
