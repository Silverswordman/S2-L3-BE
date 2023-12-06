package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;


    public Order() {
        this.products = new ArrayList<>();
    }


    public List<Product> getProducts() {
        return products;
    }

    // metodo unico per  lista prodotti che sia sia books sia price maggiore di 100
    public List<Product> getExpensiveBooks() {
        return products.stream()
                .filter(product -> "Books".equals(product.getCategory()) && product.getPrice() > 100)
                .collect(Collectors.toList());
    }

    public List<Product> getBabyProducts() {
        return products.stream()
                .filter(product -> "Baby".equals(product.getCategory()))
                .collect(Collectors.toList());
    }
}