package IfAndElse;

import java.util.Scanner;

public class TirarHabilitação {

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
		System.out.println("Digite a sua Idade: ");
		int idade = scanner.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você pode tirar a sua habilitação");	
		} else {
			System.out.println("Você não pode tirar sua habilitação, você não tem idade suficiente");	
		}
		}
	}
	