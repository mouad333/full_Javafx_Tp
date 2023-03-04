package ma.enset.full_javafx.dao;

import ma.enset.full_javafx.entities.Product;

import java.util.List;

public interface ProductRepository extends DAO<Product, Long>{
    List<Product> findByQuery(String query);
}
