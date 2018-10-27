package br.com.cursojava.aula006;

public class Contato {

	// Encapsulamento. Quando Private só a classe enxerga o método.
	private String nome = "Nome Padrão";
	private String email;
	private String telefone;
	public String setEmail;
	public String setTelefone;

	private static int quantidadeContatos = 0;

	public Contato() {
		quantidadeContatos++;
		System.out.println("Quantidade de contatos = " + quantidadeContatos);
	}

	public void configurarNome(String nome) {
		if (nome != null && nome.length() >= 3) {
			this.setNome(nome);

		}
	}

	String retornarNome() {
		return getNome();

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}