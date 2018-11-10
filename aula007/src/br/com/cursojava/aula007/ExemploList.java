package br.com.cursojava.aula007;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		// adicionar elementos ao final da lista

		nomes.add("João");
		nomes.add("Maria");
		System.out.println(nomes);
		// retornar a quantidade de elementos da lista [lista.size()]
		System.out.println(nomes.size());
		// adicionar elementos no inicio
		nomes.add(0, "José");
		nomes.add(0, "Ana");
		System.out.println(nomes);
		nomes.add("Frederico");
		System.out.println(nomes);
		// trocar o elemento [lista.set(indice,elemento)]
		nomes.set(nomes.size() - 1, "Tiburcio");
		System.out.println(nomes);
		// buscar um elemento especifico na lista [lista.get(indice)]
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(2));
		System.out.println(nomes.get(3));
		System.out.println(nomes.get(4));
		// verificar o indice de um elemento [lista.indexIf(elemento)]
		System.out.println(nomes.indexOf("Tiburcio"));
		System.out.println(nomes.indexOf("Tibúrcio")); // se não encontrar retorna -1.
		// verificar se um elemento está contido na lista
		// [lista.contains(elemento)]
		System.out.println(nomes.contains("João"));
		System.out.println(nomes.contains("Bartolomeu"));
		// criar uma sublista [lista.subList(inicio,fim)]
		List<String> sublista = nomes.subList(2, nomes.size());
		System.out.println(sublista);
		// remover um elemento da lista através do índice [lista.remove(index)]
		System.out.println(nomes);
		nomes.remove(0);
		System.out.println(nomes);
		// remover um elemento da lista através da refeência
		// [lista.remove(elemento)]
		nomes.remove("Maria");
		System.out.println(nomes);

	}

}
