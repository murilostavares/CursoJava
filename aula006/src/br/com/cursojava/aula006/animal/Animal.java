package br.com.cursojava.aula006.animal;

public class Animal {

	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void correr() {
		System.out.println("Animal Correndo...");

	}

	public void comer(String comida) {
		System.out.println("Animal Correndo...");

	}

}
