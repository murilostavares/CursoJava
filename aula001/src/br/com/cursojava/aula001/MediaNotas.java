package br.com.cursojava.aula001;

public class MediaNotas {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 9;
		int n3 = 8;

		System.out.println("A média dos valores é:");
		System.out.println((n1 + n2 + n3) / 3);
		System.out.println("");
		System.out.printf("%d + %d + %d = %d \n",  n1, n2, n3, n1 + n2 + n3);
		System.out.printf("%d / %d = %d \n",   n1 + n2 + n3, 3, (n1 + n2 + n3) / 3 );
				
	}

}
