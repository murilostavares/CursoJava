package br.com.cursojava.aula006;

import java.util.Scanner;

public class App {
	
	public static void maind(String[] args){
		
		
		Contato contato = new Contato();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do contato");
		String nome = teclado.nextLine();
		contato.setNome(nome);
		contato.setEmail = "felipe@teste.com";
		contato.setTelefone = "33221100";
		
		
		System.out.println(contato.retornarNome());;
		System.out.println(contato.getEmail());
		
		
		teclado.close();
		
		
	}
	
	

}
