package aula05;

public class Exercicio03 {

	public static void main(String[] args) {
		// Dada a matriz abaixo:
		// |10 | 9 | 8 | 7 |
		// | 6 | 5 | 4 | 3 |
		// | 2 | 1 | 2 | 3 |
		// | 4 | 5 | 6 | 7 |
		// Crie um programa que armazene a matriz e realize as seguintes operações:
		// a)Calcule e apresente o valor da soma de todos os valores da matriz;
		// b)Apresente os valores diagonal principal
		// c)Apresente os valoers da diagonal secundária
		// d)Crie e apresente uma nova matriz que armazene o valor
		// e) Crie uma nova matriz que deve armazenar os valores acima da diagonal
		// principal multiplicados pelo valor da diagonal secundária, e os valores abaixo da
		// diagonal principal devem ser multiplicados pelo proprio valor da diagonal principal. 
		// Os valores da diagonal principal devem ser elevados ao cubo.
		
		int[][] matriz = new int[4][4];
		matriz[0][0] = 10;
		matriz[0][1] = 9;
		matriz[0][2] = 8;
		matriz[0][3] = 7;
		matriz[1][0] = 6;
		matriz[1][1] = 5;
		matriz[1][2] = 4;
		matriz[1][3] = 3;
		matriz[2][0] = 2;
		matriz[2][1] = 1;
		matriz[2][2] = 2;
		matriz[2][3] = 3;
		matriz[3][0] = 4;
		matriz[3][1] = 5;
		matriz[3][2] = 6;
		matriz[3][3] = 7;
		int soma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
			}
		}
		System.out.println("A soma dos valores da matriz é: " + soma);
		System.out.println();
		System.out.print("A diagonal principal é: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + ", ");
		}
		System.out.println();
		System.out.print("A diagonal secundária é: ");
		for (int i = 0, limite = matriz.length - 1; i < matriz.length; i++) {
			System.out.print(matriz[i][limite--] + ", ");
		}
		System.out.println();
		int[][] novaMatriz = new int[4][4];
		for (int linha = 0; linha < novaMatriz.length; linha++) {
			for (int coluna = 0; coluna < novaMatriz[linha].length; coluna++) {
				novaMatriz[linha][coluna] = matriz[linha][coluna] * matriz[linha][linha];
			}
		}

		System.out.println("Nova matriz multiplicada pela diagonal principal:");
		for (int[] linha : novaMatriz) {
			for (int celula : linha) {
				System.out.printf("% 4d ", celula);
			}
			System.out.println();
		}

		for (int linha = 0, limite = matriz.length - 1; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				if (linha == coluna) {
					novaMatriz[linha][coluna] = (int) Math.pow(matriz[linha][coluna], 3);
				} else if (coluna < linha) {
					novaMatriz[linha][coluna] = matriz[linha][coluna] * matriz[linha][coluna];
				} else if (coluna > linha) {
					novaMatriz[linha][coluna] = matriz[linha][coluna] * matriz[linha][limite];
				}
			}
			limite--;

		}
		System.out.println("Nova Matriz alterada:");
		//for (int linha = 0; linha < novaMatriz.length;linha++) {
			//for (int coluna = 0; coluna < novaMatriz[linha].length;coluna++) {
				//System.out.print(novaMatriz[linha][coluna]);
			//}
	//	}
		
		for (int[] linha : novaMatriz) {
			for (int celula : linha) {
				System.out.printf("% 5d ", celula);
			}
		}

	}
}
