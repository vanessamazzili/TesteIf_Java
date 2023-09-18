package IfAndElse;

import java.util.Scanner;

public class PgtodeCartãoCredito {
	
	public static void main (String [] args) {
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
		System.out.println("Bem-vindo ao banco Teste");
		System.out.println("Agência: ");
		int agencia = scanner.nextInt();
		
		if (agencia == 123) {
		} else {
			System.out.println("Número Inválido. Digite novamente.");
		}	
		
		
		System.out.println("Conta: ");
		int conta = scanner.nextInt();
		
		if (conta >= 0123) {
			System.out.println("Olá, Clara Azevedo!");
			System.out.println("Saldo: 20.100,00");
					
		} else {
			System.out.println("Número Inválido. Digite novamente");
		}

		System.out.println("Sua fatura atual de R$2.304,00 vence amanhã (02/06). Deseja fazer o pagamento por meio do seu saldo em conta corrente? Digite 1. Sim ou 2. Não");
		int resp = scanner.nextInt();
		
		if (resp == 1) {
			System.out.println("Confirmado. Saldo disponível para pagamento.");
					
		} else {
			System.out.println("Obrigada por estar conosco!");
		}
        
		System.out.println("Digite 3. Avançar e prossiga com o pagamento ou 0. Cancelar");
		int resp2 = scanner.nextInt();
		if (resp2 == 3) {
			System.out.println("Pagamento Efetuado com sucesso. Seu saldo atual é de R$17.796,00. Obrigada!");
		} else {
			System.out.println("Pagamento Cancelado. O banco Teste agradece!");  
		}
	
	}
	
}
