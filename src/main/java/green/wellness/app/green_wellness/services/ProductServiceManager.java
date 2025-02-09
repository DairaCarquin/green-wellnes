package green.wellness.app.green_wellness.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import green.wellness.app.green_wellness.entities.Product;
import green.wellness.app.green_wellness.repositories.ProductRepository;
import jakarta.transaction.Transactional;

@Service
public class ProductServiceManager implements ProductService{
    
    @Autowired
    ProductRepository productRepository;
    @Override
    @Transactional
    public Product save(Product product) {
        return this.productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

}
