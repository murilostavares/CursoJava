package br.com.cursojava.aula006.animal;

public class Cachorro extends Animal {
	
	@Override
	public void comer(String comida) {
		
		System.out.println("O animal que está comendo é um cachorro.");

	}
	
	@Override
	public void correr() {
		
		System.out.println("O cachorro está correndo");

	}
	

}
