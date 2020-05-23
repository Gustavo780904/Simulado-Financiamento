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

		int opcaoMenu;
		double valorEntrada = 0, valorFinanciado = 0, valorPrestacao;
		do {
			System.out.println("MENU:");
			System.out.println("1 - Mostrar valor da entrada");
			System.out.println("2 - Mostrar o valor financiado");
			System.out.println("3 - Mostrar valor de cada prestação");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opcao: ");
			opcaoMenu = sc.nextInt();
			if (opcaoMenu < 1 || opcaoMenu > 4) {
				System.out.printf("\nOPCAO INVALIDA%n");
			}else if (opcaoMenu == 1) {
				valorEntrada = valorFinanciamento * (percentEntrada / 100);
				System.out.printf("%nENTRADA = R$ %.2f%n\n", valorEntrada);
			} else if (opcaoMenu == 2) {
				valorFinanciado = valorFinanciamento - valorEntrada;
				System.out.printf("%nVALOR FINANCIADO = R$ %.2f%n\n", valorFinanciado);
			} else if (opcaoMenu == 3) {
				valorPrestacao = valorFinanciado / prestacoes;
				System.out.printf("%nVALOR DE CADA PRESTACAO = R$ %.2f%n", valorPrestacao);
			} else if (opcaoMenu == 4) {
				System.out.printf("%nFIM DO PROGRAMA!");
			}
		} while (opcaoMenu != 4);

		sc.close();
	}
}
