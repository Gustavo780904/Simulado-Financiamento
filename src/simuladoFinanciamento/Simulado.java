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
		int prestacoes;
		double percentEntrada;
		double valorFinanciamento;
		
		
		System.out.print("Numero de prestacoes: ");
		prestacoes = sc.nextInt();
		System.out.print("Porcentagem de entrada: ");
		percentEntrada = sc.nextDouble();
		
		do {	
			System.out.print("Valor total financiado: ");
			valorFinanciamento = sc.nextDouble();
		} while ((valorFinanciamento - (percentEntrada / 100 * valorFinanciamento)) / prestacoes > salario * 0.3);
		
		sc.close();
	}

}
