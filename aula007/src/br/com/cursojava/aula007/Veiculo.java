package br.com.cursojava.aula007;

public class Veiculo {

	private Integer id;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private int anoModelo;

	/* Construtor
	 * Tem exatamente o nome da classe!
	 * Não tem informação nenhua de tipo (int,String, void, etc...)
	 */
	
	public Veiculo(Integer id) {
//		this chama o Construtor de próprio nome.
		this();
		this.id = id;

	}

	public Veiculo() {
//super chama o construtor da classe Object		
		super();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	// Serve para transformar o objeto inteiro em String. Para ser mais fácil
	// visuliza-lo.
	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao
				+ ", anoModelo=" + anoModelo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	// Serve para transformar o objeto inteiro em String. Para ser mais fácil
	// visuliza-lo.
	// public String toString() {
	//
	// return "Veiculo " + id + " - " + marca + " - " + modelo + " - " +
	// anoFabricacao + " - " + anoModelo;

	// }

	// public boolean equals(Object objeto) {
	//
	// if (objeto instanceof Veiculo) {
	// Veiculo v = (Veiculo) objeto;
	//
	// if (id != null && v.id != null) {
	// return id.equals(v.id);
	// } else if (id == null && v.id == null) {
	// return true;
	// }
	//
	// }
	// return false;
	// }
	//
	// @Override
	// public int hashCode() {
	// int base = 17;
	// int numero = id != null ? id.hashCode() : 1;
	// return base + numero;
	// }

}
