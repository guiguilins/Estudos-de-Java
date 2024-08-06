package Introduction.DolarStaticPOO.application;

import java.util.Locale;
import java.util.Scanner;

import Introduction.DolarStaticPOO.util.CurrecyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the dollar price?: ");
        double dolar = sc.nextDouble();
        System.out.println("How many dollars will be bought: ");
        double dolarBuy = sc.nextDouble();


        double d = CurrecyConverter.converterReal(dolar, dolarBuy);
        
        System.out.printf("Amount to be paid in reais = %.2f%n ", d);
        sc.close();
    }
}
