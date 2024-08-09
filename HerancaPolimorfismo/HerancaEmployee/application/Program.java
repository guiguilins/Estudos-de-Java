package HerancaPolimorfismo.HerancaEmployee.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import HerancaPolimorfismo.HerancaEmployee.entities.Employee;
import HerancaPolimorfismo.HerancaEmployee.entities.OutsourcedEmployee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Employees: ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

            } else {
                list.add(new Employee(name, hours, valuePerHour));

            }

        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee c : list) {
            System.out.println(c.getName() + "- $ " + String.format("%.2f%n", c.payment()));
        }

        sc.close();
    }
}
