package br.com.cursojava.aula001;

public class Min {
	public static void main(String[] args) {
		
	int a = 10;
	int b = 7;
	int c = 20;
	int d = 30;
	
	
	System.out.printf("%s %d %d %d %s %d %s","O menor número entre", a, b, c, "e", d, "é");
	System.out.println("");
	System.out.println(Math.min(Math.min(a, d), Math.min(c, b)));
	
	}
}