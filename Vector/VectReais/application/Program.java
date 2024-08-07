package Vector.VectReais.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            double num = sc.nextDouble();
            vect[i] = num;
        }

        System.out.println("Numeros: ");

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f  ", vect[i]);
        }

        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double avg = sum / vect.length;
        System.out.println("Soma: " + sum);
        System.out.printf("Media: %.2f%n ", avg);
        sc.close();
    }
}