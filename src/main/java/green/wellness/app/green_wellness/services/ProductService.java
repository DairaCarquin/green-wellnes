package green.wellness.app.green_wellness.services;

import java.util.List;

import green.wellness.app.green_wellness.entities.Product;

public interface ProductService {
    public Product save(Product product); 
    public Product getProductById(Long id);
    public List<Product> getAllProducts();
}
