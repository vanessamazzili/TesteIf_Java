package IfAndElse;

import java.util.Scanner;

public class ComprarCarro {
	
	public static void main(String[] args) {
		// > maior
		// < menor
		// == igual
		// || ou
		// && e
		// >= maior ou igual
		// + soma 
		// - subtração
		// * multiplicação
		// / divisão
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Financie seu carro com o Itaú! Confira se seu saldo de entrada é aprovado!");
		System.out.println("Digite o saldo disponível para entrada do seu veículo: ");
		int saldo = scanner.nextInt();
		
		if (saldo >= 20000) {
			System.out.println("Saldo de entrada aprovado, financie seu veículo agora mesmo. Veja a seguir as opções disponíveis para os carros de até R$60.000.");
		} else {
			System.out.println("Saldo insuficiente para o financiamento. Valor mínimo para entrada é de R$20.000");
		}
		}
	}
	
