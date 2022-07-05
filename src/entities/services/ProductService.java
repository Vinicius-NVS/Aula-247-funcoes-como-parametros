package entities.services;

import entites.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double somaPorNome(List <Product> list) {
        double soma = 0.0;
        for (Product p : list) {
            if (p.getName().charAt(0) == 'T') {
                 soma += p.getPrice();
            }
        }
        return soma;
    }
}
