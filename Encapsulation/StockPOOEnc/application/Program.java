package Encapsulation.StockPOOEnc.application;

import java.util.Locale;
import java.util.Scanner;

import Encapsulation.StockPOOEnc.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity on stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);
        product.setName("Computer");
        
        System.out.println("Updated Name: " + product.getName());
        
        System.out.println("Product Data: " + product);
        
        System.out.println();
        System.out.println("Enter the number of products to be added: ");
        quantity = sc.nextInt();
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
