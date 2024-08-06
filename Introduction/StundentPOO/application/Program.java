package Introduction.StundentPOO.application;

import java.util.Locale;
import java.util.Scanner;

import Introduction.StundentPOO.entities.Stundent;

public class Program {
   
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Stundent x = new Stundent();
        
        System.out.println("Name: ");
        x.name = sc.nextLine();
        System.out.println("Grade 1: ");
        x.gradeOne = sc.nextDouble();
        System.out.println("Grade 2: ");
        x.gradeTwo = sc.nextDouble();
        System.out.println("Grade 3: ");
        x.gradeThree = sc.nextDouble();

        System.out.println("FINAL GRADE = " + x.finalGrade());

        if (x.finalGrade() > 60) {
            System.out.println("PASS");
        }

        else {
            System.out.println("FAILED");
            System.out.println("MISSING POINTS " + x.missingPoints());
        }
        sc.close();
    }
}
