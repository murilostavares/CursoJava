package br.com.cursojava.aula009;

import java.util.List;

public class ContatoTest {

	public static void main(String[] args) {

		
//		testInserir();
//		testeListarTodos();
//		testeBuscarPorId();
//		testeAtualizar();
//		testeRemover();
		testeContar();

	}

	private static void testInserir() {
		Contato contato = new Contato(null, "Bagrinho", "email@teste.com", "33221100");
		RepositorioContato repositorio = new RepositorioContato();

		repositorio.inserir(contato);
		System.out.println(contato);

	}

	private static void testeListarTodos() {

		RepositorioContato repositorio = new RepositorioContato();
		List<Contato> buscarTodos = repositorio.buscarTodos();
		System.out.println("=================");
		System.out.println("LISTAR TODOS");
		System.out.println("=================");
		for (Contato contato : buscarTodos) {
			System.out.println(contato);
		}

	}

	private static void testeBuscarPorId() {

		System.out.println("=================");
		System.out.println("LISTAR POR ID");
		System.out.println("=================");
		RepositorioContato repositorio = new RepositorioContato();
		System.out.println(repositorio.buscarPorId(1));
		System.out.println(repositorio.buscarPorId(5000));

	}

	private static void testeAtualizar() {

		RepositorioContato repositorio = new RepositorioContato();
		Contato contato = repositorio.buscarPorId(1);
		contato.setNome("Bragrinho da Silva Brasil");
		repositorio.atualizar(contato);
		contato = repositorio.buscarPorId(1);
		System.out.println(contato);

	}

	private static void testeRemover() {

		System.out.println("=================");
		System.out.println("REMOVER");
		System.out.println("=================");
		RepositorioContato repositorio = new RepositorioContato();
		repositorio.remover(1);
		System.out.println(repositorio.buscarPorId(1));

	}

	private static void testeContar() {

		System.out.println("=================");
		System.out.println("CONTAR");
		System.out.println("=================");
		RepositorioContato repositorio = new RepositorioContato();
		System.out.println(repositorio.contar());

	}

}