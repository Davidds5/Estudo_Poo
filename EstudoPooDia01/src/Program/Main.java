package Program;

import application.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> listProducts = new ArrayList<>();

        // Cadastro dos produtos
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter products data #" + (i+1) + ": ");
            System.out.print("Product name: ");
            String nameProduct = sc.nextLine();

            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();

            System.out.print("Product quantity: ");
            int quantityProduct = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            Product productAdd = new Product(nameProduct, priceProduct, quantityProduct);
            listProducts.add(productAdd);
        }

        // Mostrando todos os produtos
        System.out.println("\n--- Lista de Produtos ---");
        for (Product product : listProducts) {
            System.out.println(product);
        }

        // Buscar produto
        System.out.print("\nBusque o produto pelo nome: ");
        String nomeBusca = sc.nextLine();
        boolean encontrado = false;

        for (Product product : listProducts) {
            if (product.getName().equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                System.out.println("Nome encontrado com sucesso.");

                System.out.print("Deseja atualizar a quantidade? (s/n): ");
                String resposta = sc.nextLine().toLowerCase(Locale.ROOT);

                if (resposta.equals("s")) {
                    System.out.print("Quanto deseja adicionar: ");
                    int novoQuantity = sc.nextInt();
                    sc.nextLine(); // limpa o buffer

                    product.setQuantity(product.getQuantity() + novoQuantity);
                    System.out.println("Produto atualizado.");
                    System.out.println("Nova Quantidade: " + product.getQuantity());
                }
                break; // para de procurar depois de encontrar
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }

        // Lista final
        System.out.println("\n--- Lista Final de Produtos ---");
        for (Product product : listProducts) {
            System.out.println(product);
        }

        sc.close();
    }
}
