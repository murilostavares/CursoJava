package br.com.cursojava.aula006.lojinha;

public class FolhaPagamento {

	public void imprimir(Funcionario funcionario) {
		System.out.println("========= FOLHA PAGAMENTO ========");
		System.out.println();
		System.out.printf("Nome: %s\n", funcionario.getNome());
		System.out.printf("Salário Base: %.2f\n", funcionario.getSalarioBase());
		System.out.printf("Salario Líquido: %.2f\n", funcionario.getSalarioLiquido());
		System.out.println();
		System.out.println("========= XXXXXXXXXXXXXXX ========");

	}

}
