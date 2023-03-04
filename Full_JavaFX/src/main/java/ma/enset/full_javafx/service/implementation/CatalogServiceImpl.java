package ma.enset.full_javafx.service.implementation;

import ma.enset.full_javafx.dao.CategoryRepository;
import ma.enset.full_javafx.dao.ProductRepository;
import ma.enset.full_javafx.entities.Category;
import ma.enset.full_javafx.entities.Product;
import ma.enset.full_javafx.service.CatalogService;

import java.util.List;

public class CatalogServiceImpl implements CatalogService {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public CatalogServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.update(product);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findProductsByQuery(String query) {
        return productRepository.findByQuery(query);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.delete(id);
    }



    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.update(category);
    }

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.delete(id);
    }
}
