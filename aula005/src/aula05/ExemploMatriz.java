package aula05;

public class ExemploMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] notas = new double[5][3];
		int []posicoes[] = new int[2][2];
		String nomes[][] = new String [3][2];
		
		String[][]regioes = new String[2][];
		regioes[0] = new String [3];
		regioes[1] = new String [4];
		regioes[0][0] = "Rio Grande do Sul";
		regioes[0][1] ="Santa Catarina"; 
		regioes[0][2] ="Paran�";
		regioes[1][0] ="S�o Paulo";
		regioes[1][1] ="Rio de Janeiro";
		regioes[1][2] ="Minas Gerais";
		regioes[1][3] ="Esp�rito Santo";

		int[][] pontos = {{20,16,16},{16,24,16},{16,24,16}};
		String[][] disciplinas = new String[][] {{"l�gica","Banco de dados","Java Fundametos"},
												{"HTML","CSS","Javascript B�sico"},
												{"Angular 1","Angular 6", "React", "Vuejs"}};
												
												
		for (int regiao= 0; regiao <regioes.length; regiao++) {
			for(int estado = 0; estado < regioes[regiao].length;estado++) {
				System.out.println(regioes[regiao][estado]);
			}
		}
		System.out.println("===========================================");
		for(String[] curso : disciplinas) {
			for (String disciplina : curso) {
				System.out.println(disciplina + ", ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		}
	}

