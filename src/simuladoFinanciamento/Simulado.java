package simuladoFinanciamento;

import java.util.Locale;
import java.util.Scanner;

public class Simulado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		String nome = sc.nextLine();
		double salario;
		do {
		System.out.print("Salario: ");
		salario = sc.nextDouble();
		} while (salario < 0);	
		
		
		sc.close();
	}

}
