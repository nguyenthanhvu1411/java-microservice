package com.nguyenthanhvu.productservice.repository;
import com.nguyenthanhvu.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

    
} 