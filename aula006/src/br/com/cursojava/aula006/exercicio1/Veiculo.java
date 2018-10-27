package br.com.cursojava.aula006.exercicio1;

public class Veiculo {

	private int velocidadeAtual;
	private boolean ligado;

	public void acelerar(int valor) {
		this.velocidadeAtual += valor;
	}

	public void parar() {
		this.velocidadeAtual = 0;
	}

	public void ligar() {
		ligado = true;
	}

	public void desligar() {
		ligado = false;

	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

}
