package HerancaPolimorfismo.HerancaAccount.application;

import java.util.Locale;
import java.util.Scanner;

import HerancaPolimorfismo.HerancaAccount.entities.Account;
import HerancaPolimorfismo.HerancaAccount.entities.BusinessAccount;
import HerancaPolimorfismo.HerancaAccount.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.00);

        System.out.println(acc3);
        System.out.println(acc2);
        sc.close();
    }
}
