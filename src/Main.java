import Entities.Order;
import Entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creazione di un ordine di esempio
        Order order = new Order();

        // Creazione di prodotti di esempio e aggiunta all'ordine
        Product book1 = new Product(30L, "Harry Potter e La Pietra Filosofale", "Books", 120.0);
        Product book2 = new Product(20L, "Cronache di Narnia", "Books", 20.0);
        Product book3 = new Product(60L, "Favole per la notte", "Books", 160.0);
        Product baby1 = new Product(50L, "Sonaglio", "Baby", 20.0);
        Product baby2 = new Product(10L, "Pannolini", "Baby", 40.0);
        Product boyProduct1 = new Product(65L, "Occhiali", "Boys", 50.0);
        Product boyProduct2 = new Product(22L, "Macchinina", "Boys", 90.0);
        Product girlProduct = new Product(31L, "Makeup", "Girls", 120.0);

        order.getProducts().add(book1);
        order.getProducts().add(book3);
        order.getProducts().add(book2);
        order.getProducts().add(baby1);
        order.getProducts().add(baby2);
        order.getProducts().add(boyProduct1);
        order.getProducts().add(boyProduct2);
        order.getProducts().add(girlProduct);


        List<Product> expensiveBooks = order.getExpensiveBooks();
        List<Product> babyProducts = order.getBabyProducts();
        List<Product> discountedBoysProducts = order.getBoysProducts();

        // stampa dei books col for each
        System.out.println("I libri oltre i 100 euro sono:");
        expensiveBooks.forEach(product -> System.out.println(product.getName() + " - " + product.getPrice()));
        // roba per bimbi
        System.out.println("I prodotti per bambini sono:");
        babyProducts.forEach(product -> System.out.println(product.getName()));

        System.out.println("Prodotti scontati per ragazzi:");
        discountedBoysProducts.forEach(product -> System.out.println(product.getName() + " - " + product.getPrice()));
    }
}

