package br.com.cursojava.aula007;

public class Aplicativo {

	public static void main(String[] args) {
		
		
		Veiculo v1 = new Veiculo(30);
		v1.setMarca("Honda");
		v1.setModelo("Civic");
		v1.getId();
		v1.setAnoFabricacao(2018);
		v1.setAnoModelo(2019);

		Veiculo v2 = new Veiculo(null);
		v2.setMarca("Honda");
		v2.setModelo("Civic");
		v2.setId(2);
		v2.setAnoFabricacao(2018);
		v2.setAnoModelo(2019);

		// N�o a necessidade de colocar o toString. Se colocar s� o objeto.
		// Sempre ir� puxar o toString.
		// Caso eu n�o tenha sobreescrito o toString ele trar� da classe objects
		// System.out.println(v1.toString());
		System.out.println(v1);
		
		System.out.println(v1.equals(v2));

	}

}
