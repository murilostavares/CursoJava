package br.com.cursojava.aula006.exercicio1;

public class Testes {

	public static void main(String[] args) {

		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Carro();
		Veiculo av = new Aviao();
		Veiculo v3 = av;

		v3.ligar();
		v3.acelerar(10);
		v3.parar();
		v3.desligar();

		av.ligar();
		av.acelerar(10);
		av.parar();
		av.desligar();

		if (v3 instanceof Aviao) {
			((Aviao) v3).voar();
		}

	}

}
