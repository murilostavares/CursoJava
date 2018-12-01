package br.com.cursojava.aula009.produtos;

import java.util.List;

public class MainProduto {

	public static void main(String[] args) {

		// testInserir();
		// testeListarTodos();
		// testInserir2();
		// testeAtualizar();
		// testeRemover();
		// testeContar();

		testeListarRange();

	}

	private static void testInserir() {
		Produto produto = new Produto(null, "Baleia", "Peixe Grande", 14.40);
		RepositorioProduto repositorio = new RepositorioProduto();

		repositorio.inserir(produto);
		System.out.println(produto);

	}

	private static void testInserir2() {
		Produto produto = new Produto(null, "Tilapia", "Peixe Gostoso", 5.40);
		RepositorioProduto repositorio = new RepositorioProduto();

		repositorio.inserir(produto);
		System.out.println(produto);

	}

	private static void testeListarTodos() {

		RepositorioProduto repositorio = new RepositorioProduto();
		List<Produto> buscarTodos = repositorio.buscarTodos();
		System.out.println("=================");
		System.out.println("LISTAR TODOS");
		System.out.println("=================");
		for (Produto produto : buscarTodos) {
			System.out.println(produto);
		}

	}

	private static void testeBuscarPorId() {

		System.out.println("=================");
		System.out.println("LISTAR POR ID");
		System.out.println("=================");
		RepositorioProduto repositorio = new RepositorioProduto();
		System.out.println(repositorio.buscarPorId(1));
		System.out.println(repositorio.buscarPorId(5000));

	}

	private static void testeAtualizar() {

		RepositorioProduto repositorio = new RepositorioProduto();
		Produto produto = repositorio.buscarPorId(4);
		produto.setPreco(9);
		repositorio.atualizar(produto);
		produto = repositorio.buscarPorId(4);
		System.out.println(produto);

	}

	private static void testeRemover() {

		System.out.println("=================");
		System.out.println("REMOVER");
		System.out.println("=================");
		RepositorioProduto repositorio = new RepositorioProduto();
		repositorio.remover(1);
		System.out.println(repositorio.buscarPorId(1));

	}

	private static void testeContar() {

		System.out.println("=================");
		System.out.println("CONTAR");
		System.out.println("=================");
		RepositorioProduto repositorio = new RepositorioProduto();
		System.out.println(repositorio.contar());

	}

	private static void testeListarRange() {

		RepositorioProduto repositorio = new RepositorioProduto();
		List<Produto> buscarTodos = repositorio.buscarRange(6, 16);
		System.out.println("=================");
		System.out.println("LISTAR Range");
		System.out.println("=================");
		for (Produto produto : buscarTodos) {
			System.out.println(produto);
		}

	}

}
