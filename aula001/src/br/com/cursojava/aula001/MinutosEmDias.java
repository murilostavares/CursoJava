package br.com.cursojava.aula001;

public class MinutosEmDias {
	public static void main(String[] args) {
	
	int minutosHora = 60;
	int horasDia = 24;
	int dias = 90;
	int diasHora = (minutosHora * horasDia) * dias;
	
	
	System.out.println("A quantidade de minutos em 90 dias é:");
	System.out.println("");
	System.out.print(diasHora);
	System.out.println(" minutos");
	
	}
}
