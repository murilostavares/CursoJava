package br.com.cursojava.aula001;

public class AreaCirculo {
	public static void main(String[] args) {
		
		int diametro = 20;
		int raio = diametro / 2;
		double pi = 3.1416;
		
		System.out.println("A area do círculo com diametro 20 é:");
		System.out.println("");
		System.out.println((raio * raio) * pi);
		System.out.println("");
		System.out.printf("%f * ( %d * %d ) = %f \n",  pi, raio, raio, (raio * raio) * pi);
		
		
	}
	
	
	

}
