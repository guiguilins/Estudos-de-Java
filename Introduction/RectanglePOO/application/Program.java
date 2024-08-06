package Introduction.RectanglePOO.application;

import java.util.Locale;
import java.util.Scanner;

import Introduction.RectanglePOO.entities.Rectangle;

public class Program {
  
         public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle x = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        x.width = sc.nextDouble();
        x.height= sc.nextDouble();

        System.out.println("AREA = " + x.area());
        System.out.println("PERIMETER = " + x.perimeter());
        System.out.println("DIAGONAL = " + x.diagonal());


        sc.close();
    }
}
