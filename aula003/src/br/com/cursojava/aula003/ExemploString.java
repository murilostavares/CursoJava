package br.com.cursojava.aula003;

public class ExemploString {

	public static void main(String[] args) {

		String curso = "Curso Java TranspoBrasil Sábado";

		// Quantidade de caracteres
		System.out.printf("O texto %s possui %d caracteres \n", curso, curso.length());

		// replace
		String semEspaco = curso.replace(" ", "");

		// Quantidade de caracteres sem espaço
		// length
		System.out.printf("O texto %s possui %d caracteres \n", semEspaco, semEspaco.length());

		System.out.println("");
		System.out.println(curso);
		System.out.println(semEspaco);
		System.out.println("");
		// usar 2 metodos dentro da mesma variavel:
		System.out.println(curso.replace(" ", "").length());

		// ***** replace retorna sempre uma String ********

		// contains e startsWith e endsWith (contém, Começa com e Termina com)

		System.out.println("Quantidade de caracteres");
		System.out.println(curso.contains("TranspoBrasil"));
		System.out.println("Começa com 'Curso?'");
		System.out.println(curso.startsWith("Curso"));
		System.out.println("Termina com 'Domingo'?");
		System.out.println(curso.endsWith("Domingo"));
		System.out.println("");

		// indexOf e lastIndexOf
		// traz a primeira ocorrência e a Ultima ocorrência
		// caso ("string", valor) iniciará a busca após a posição indicada

		System.out.println(curso.indexOf("Transpobrasil"));
		System.out.println(curso.indexOf("a"));
		System.out.println(curso.indexOf("a", 10));
		System.out.println(curso.lastIndexOf("a"));

		System.out.println("");
		// toUpperCase e toLowerCase
		System.out.println(curso.toUpperCase());
		System.out.println(curso.toLowerCase());

		// substring
		// retorna os carcteres a partir de determinada posição
		// retorna de dererminada posição, até outra posição
		// a primeira é inclusiva, a segunda exclusiva
		System.out.println(curso.substring(11));
		System.out.println(curso.substring(11, 23));

		// exemplo (reduzir as letras retornar a primeira posição da palavra
		String palavra = "sábado";
		int indice = curso.toLowerCase().indexOf(palavra.toLowerCase());
		System.out.println(indice);
		
		
		//charAt
		//Retorna o caracter inserido na posição da String
		
		System.out.println(curso.charAt(10));
		System.out.println(curso.charAt(11));
		System.out.println(curso.charAt(12));
		System.out.println(curso.charAt(13));
		System.out.println(curso.charAt(14));
		System.out.println("");
		System.out.println("");
		
		//Exemplo
		String user1 = "João";
		String user2 = "João";
		String user3 = new String("João");
		//compara memória RIP, mas os Strings tem um Pool de String para a mesma String. Que é imutavel
		System.out.println(user1 == user2);
		System.out.println(user1 == user3);
		//Compara a identidade (Caracteres)
		System.out.println(user1.equals(user2));
		System.out.println(user1.equals(user3));
		//IgnoreCase
		System.out.println(user1.equalsIgnoreCase("JOÃO"));
		System.out.println("joão".equalsIgnoreCase("JOÃO"));
		
		//metodo trim Remove os espaços antes e depois do texto
		String texto = "   oi pessoal   ";
		
		
		//metodo trim Remove os espaços antes e depois do texto. Muito usado
		System.out.printf(">%s< , length = %d\n",texto,texto.length());
		System.out.printf(">%s< , length = %d\n",texto.trim(), texto.trim().length());
		
		
		//metodo split organiza e quebra o texteo conforme o "separador" indicado.
		String registro = "contato;contato@teste.com;33221100";
		String[] valores = registro.split(";");
		System.out.println(valores[0]);
		System.out.println(valores[1]);
		System.out.println(valores[2]);
		
		
		
		
		
		
		
		
		
		
		
	}

}
