package br.com.cursojava.aula006.animal;

public class Gato extends Animal {

	public void comer(String comida) {

		System.out.println("O animal que est� comendo � um Gato.");

	}

	public void comer(String comida, int quantidade) {

		System.out.println("O animal que est� comendo � um Gato. E comeu" + comida + "," + quantidade + "Vezes");

	}

	@Override
	public void correr() {

		System.out.println("O gato est� correndo...");

	}

}
