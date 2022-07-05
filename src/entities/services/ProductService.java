package entities.services;

import entites.Product;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProductService {

    public double somaPorNome(List <Product> list, Predicate<Product> criterio) {
        double soma = 0.0;
        for (Product p : list) {
            if (criterio.test(p)) {
                 soma += p.getPrice();
            }
        }
        return soma;
    }
}
