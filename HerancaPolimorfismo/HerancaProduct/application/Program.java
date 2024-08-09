package HerancaPolimorfismo.HerancaProduct.application;

import java.text.ParseException;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import HerancaPolimorfismo.HerancaProduct.entities.Product;
import HerancaPolimorfismo.HerancaProduct.entities.UsedProduct;
import HerancaPolimorfismo.HerancaProduct.entities.ImportedProduct;

public class Program {
        public static void main(String[] args) throws ParseException {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

           List<Product> list = new ArrayList<>();

            System.out.print("Enter the number of products: ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                System.out.println("Product #" + i + " data");
                System.out.print("Common, used or imported (c/u/i)? ");
                char ch = sc.next().charAt(0);
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();

                if(ch == 'i') {
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    list.add(new ImportedProduct(name, price, customsFee));
                }

                if(ch == 'u') {
                    System.out.print("Manufacture date (DD/MM/YYYY) ");
                    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    list.add(new UsedProduct(name, price, date));
                }

                else {
                    list.add(new Product(name, price));
                }
            }
                
            System.out.println("PRICE TAGS: ");
                for(Product c: list) {
                    System.out.println(c.priceTag());
                }

            

            sc.close();
        }
}
