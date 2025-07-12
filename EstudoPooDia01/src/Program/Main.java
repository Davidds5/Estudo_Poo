package Program;

import application.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> listProducts = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Product data #" + (i + 1) + ": ");
            System.out.println("Product name: ");
            String name = sc.nextLine();

            System.out.println("Product price: ");

            double price = sc.nextDouble();

            System.out.println("Product quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(name, price, quantity);

            listProducts.add(product);
        }

        for (Product product : listProducts) {
            System.out.println(product);
        }
        System.out.println("Digite o nome que deseja busca: ");
        String nameBusca = sc.nextLine();

        for (Product product : listProducts) {
            if (product.getName().equalsIgnoreCase(nameBusca)) {
                System.out.println(product);
            } else {
                System.out.println("Produto nao encotrado.");
            }
        }
    }
}

