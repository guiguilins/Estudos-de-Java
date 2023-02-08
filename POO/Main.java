package POO;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int idConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char verificaDeposito = sc.next().charAt(0);
		double saldo;
		while (verificaDeposito != 'y' && verificaDeposito != 'n') {
			System.out.println("Incorrect digit. Insert again: ");
			verificaDeposito = sc.next().charAt(0);
		}
		if (verificaDeposito == 'y') {
			System.out.print("Enter initial deposit value: ");
			saldo = sc.nextDouble();
		}
		else {
			saldo = 0;
		}
		
		ContaBancaria contaBancaria = new ContaBancaria(idConta, nome, saldo);
		
		System.out.println();
		System.out.println("Account data:");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f%n", 
				contaBancaria.getIdConta(), 
				contaBancaria.getName(),
				contaBancaria.getSaldoConta());
		
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		contaBancaria.deposito(value);
		System.out.println("Updated account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", 
				contaBancaria.getIdConta(), 
				contaBancaria.getName(),
				contaBancaria.getSaldoConta());
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		contaBancaria.saque(value);
		System.out.println("Updated account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", 
				contaBancaria.getIdConta(), 
				contaBancaria.getName(),
				contaBancaria.getSaldoConta());
		
		sc.close();
	}

}
