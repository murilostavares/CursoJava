package br.com.cursojava.aula006.animal;

public class Cachorro extends Animal {
	
	@Override
	public void comer(String comida) {
		
		System.out.println("O animal que est� comendo � um cachorro.");

	}
	
	@Override
	public void correr() {
		
		System.out.println("O cachorro est� correndo");

	}
	

}
