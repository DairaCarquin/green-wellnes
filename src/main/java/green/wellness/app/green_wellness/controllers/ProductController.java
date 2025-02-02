package green.wellness.app.green_wellness.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import green.wellness.app.green_wellness.entities.Product;
import green.wellness.app.green_wellness.services.ProductServiceManager;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductServiceManager productServiceManager;

    @PostMapping()
    public ResponseEntity<Product> save(@RequestBody Product product){
        Product newProduct = productServiceManager.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productServiceManager.getAllProducts();
        return ResponseEntity.ok(products);
    }
}