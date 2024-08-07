package Encapsulation.BankAccount.application;

import java.util.Locale;
import java.util.Scanner;

import Encapsulation.BankAccount.entities.BankAccount;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount bankAccount;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Is there a initital deposit (y/n)");
        char verifyDeposit = sc.next().charAt(0);

        if (verifyDeposit == 'y') {

            System.out.println("Enter initial deposit value: ");
            double value = sc.nextDouble();
            bankAccount = new BankAccount(number, name, value);

        } else {
            bankAccount = new BankAccount(number, name);
        }

        System.out.println("Account data: ");
        System.out.println(bankAccount);

        System.out.println();
        System.out.println("Enter a deposit Value: ");
        double depositValue = sc.nextDouble();
        bankAccount.depositValue(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);
        
        System.out.println();
        System.out.println("Enter a withdraw Value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);
        
        

        sc.close();
    }
}
