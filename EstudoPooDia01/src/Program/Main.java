package Program;

import application.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();


        for (int i = 0; i <3 ; i++) {
            System.out.println("Enter Product data #" + (i + 1 ) + ": ");
            System.out.println("Product name: ");
            String name = sc.nextLine();

            System.out.println("Product price: ");
            double price = sc.nextDouble();

            System.out.println("Product quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(name, price, quantity);

            products.add(product);
            }

        for (Product product : products){
            System.out.println(product);
        }

    }
}
