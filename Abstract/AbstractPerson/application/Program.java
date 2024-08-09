package Abstract.AbstractPerson.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Abstract.AbstractPerson.entities.Company;
import Abstract.AbstractPerson.entities.Individual;
import Abstract.AbstractPerson.entities.Person;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualRent = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExp = sc.nextDouble();
                list.add(new Individual(name, anualRent, healthExp));

            }

            else if (ch == 'c') {
                System.out.print("Number of employees: ");
                int employeeNumber = sc.nextInt();
                list.add(new Company(name, anualRent, employeeNumber));
            }
        }

        System.out.println("TAXES PAID: ");
        double taxPaid = 0;

        for (Person c : list) {
            System.out.println(c.getName() + ": $ " + String.format("%.2f", c.tax()));
            taxPaid += c.tax();
        }

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", taxPaid));
		

        sc.close();
    }
}
