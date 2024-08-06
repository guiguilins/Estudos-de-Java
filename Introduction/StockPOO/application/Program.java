package Introduction.StockPOO.application;

import java.util.Locale;
import java.util.Scanner;

import Introduction.StockPOO.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity on stock: ");
        product.quantity = sc.nextInt();

       System.out.println("Product Data: " + product);
        
        System.out.println();
        System.out.println("Enter the number of products to be added: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated Data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Updated Data: " + product);
        sc.close();
    }
}
