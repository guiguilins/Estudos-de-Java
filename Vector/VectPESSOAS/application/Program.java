package Vector.VectPESSOAS.application;

import java.util.Locale;
import java.util.Scanner;

import Vector.VectPESSOAS.entities.Pessoas;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();
        Pessoas[] vect = new Pessoas[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.println("Nome: ");
            String name = sc.next();
            System.out.println("Idade: ");
            int age = sc.nextInt();
            System.out.println("Altura: ");
            double height = sc.nextDouble();

            vect[i] = new Pessoas(name, height, age);

        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getHeight();
        }

        int sumIdade = 0;
        ;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16)
                sumIdade++;
        }

        double percentage = ((double)sumIdade / n) * 100.0;


        double avg = sum / vect.length;
        System.out.printf("Altura media: %.2f%n", avg);

        System.out.printf("Idade media das pessoas com menos de 16 anos:  %.1f%%n", percentage);

        for (int i = 0; i < n; i++) {
            if (vect[i].getAge() < 16) {
                System.out.printf("%s\n", vect[i].getName());
            }
        }

        sc.close();
    }
}
