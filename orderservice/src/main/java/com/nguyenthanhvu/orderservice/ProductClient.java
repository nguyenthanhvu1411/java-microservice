package com.nguyenthanhvu.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nguyenthanhvu.orderservice.dto.Product;

@FeignClient(name = "productservice")
public interface ProductClient {
    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable String id);
}
