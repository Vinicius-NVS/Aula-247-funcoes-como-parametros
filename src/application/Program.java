package application;

import entites.Product;
import entities.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD case", 80.90));

        ProductService ps = new ProductService();

        double soma = ps.somaPorNome(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("sum= " + String.format("%.2f", soma));

    }

}
