package br.com.cursojava.aula006.lojinha;

public class Vendedor extends Funcionario {

	private double percentualComissao;
	private double totalVendasMes;

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		if (percentualComissao > 1) {
			percentualComissao /= 100;
		}
		if (percentualComissao >= 0) {
			this.percentualComissao = percentualComissao;
		}
	}

	public double getTotalVendasmes() {
		return totalVendasMes;
	}

	public void setTotalVendasmes(double totalVendasmes) {
		this.totalVendasMes = totalVendasmes;
	}

	@Override
	public double getSalarioLiquido() {
		double comissao = totalVendasMes * percentualComissao;
		double salarioBruto = this.getSalarioBase() + comissao;
		return salarioBruto * (1 - 0.11);

	}

}
