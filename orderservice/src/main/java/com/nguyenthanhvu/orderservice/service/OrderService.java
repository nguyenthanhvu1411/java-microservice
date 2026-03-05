package com.nguyenthanhvu.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenthanhvu.orderservice.ProductClient;
import com.nguyenthanhvu.orderservice.dto.Product;
import com.nguyenthanhvu.orderservice.model.Order;
import com.nguyenthanhvu.orderservice.repository.OrderRepository;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductClient productClient;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order addOrder(Order order) {
        Product product = productClient.getProductById(order.getProductId());
        if (product != null) {
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Product not found");
        }

    }
}
