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
		System.out.print("Salario: ");
		double salario = sc.nextDouble();
		
		
		sc.close();
	}

}