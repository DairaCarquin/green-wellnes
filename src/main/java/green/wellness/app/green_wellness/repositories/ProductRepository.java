package green.wellness.app.green_wellness.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import green.wellness.app.green_wellness.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> { 
}