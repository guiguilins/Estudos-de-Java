package Exception.ExceptionAccount.application;

import java.util.Scanner;

import Exception.ExceptionAccount.models.entities.Account;
import Exception.ExceptionAccount.models.exceptions.AccountException;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        } catch (AccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
