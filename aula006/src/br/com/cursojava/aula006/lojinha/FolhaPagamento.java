package br.com.cursojava.aula006.lojinha;

public class FolhaPagamento {

	public void imprimir(Funcionario funcionario) {
		System.out.println("========= FOLHA PAGAMENTO ========");
		System.out.println();
		System.out.printf("Nome: %s\n", funcionario.getNome());
		System.out.printf("Sal�rio Base: %.2f\n", funcionario.getSalarioBase());
		System.out.printf("Salario L�quido: %.2f\n", funcionario.getSalarioLiquido());
		System.out.println();
		System.out.println("========= XXXXXXXXXXXXXXX ========");

	}

}
