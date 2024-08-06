package Encapsulation.BankAccount.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public double value;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        String name = sc.nextLine();
        System.out.println("Is there a initital deposit (y/n)");
        char verifyDeposit = sc.next().charAt(0);
        
        while (verifyDeposit != 'y' && verifyDeposit != 'n') {
            System.out.println("Incorrect digit. Insert again: ");
			verifyDeposit = sc.next().charAt(0);
        }
        
        if (verifyDeposit == 'y') {
        
        System.out.println("Enter initial deposit value: ");
        double value = sc.nextDouble();
        }
        else if (verifyDeposit== 'n') {
            double value = 0;
        }
        
        
        System.out.println("Enter a deposit value: ");

       

        sc.close();
    }
}
