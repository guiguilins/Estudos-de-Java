package Introduction.EmployeePOO.application;

import java.util.Locale;
import java.util.Scanner;

import Introduction.EmployeePOO.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee x = new Employee();
        System.out.println("Name: ");
        x.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        x.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        x.tax = sc.nextDouble();

        System.out.println("Employee: " + x);

        System.out.println("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        x.increaseSalary(percentage);

        System.out.println("Updated data: " + x);
        sc.close();
}
}