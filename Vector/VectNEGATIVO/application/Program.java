package Vector.VectNEGATIVO.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    
public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);


     System.out.println("Quantos numeros voce vai digitar? ");
     int n = sc.nextInt();
     int[] vect = new int[n];

     for(int i = 0; i < vect.length; i++) {
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        vect[i] = num;
}
    System.out.println("Numeros NEGATIVOS: ");
     for (int i =0; i < vect.length; i++) {
        if (vect[i] < 0) {
            System.out.printf("%d\n", vect[i]);
        }
     }



        sc.close();
}
}

