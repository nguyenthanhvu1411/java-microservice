package com.nguyenthanhvu.inventoryservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenthanhvu.inventoryservice.model.Inventory;
import com.nguyenthanhvu.inventoryservice.repository.InventoryRepository;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryByProductId(String productId) {
        return inventoryRepository.findByProductId(productId)
            .orElseThrow(() -> new RuntimeException("Product not found: " + productId));
    }

    public Inventory updateInventory(String productId, int quantity) {
        Inventory inventory = inventoryRepository.findByProductId(productId)
            .orElseGet(() -> {
                Inventory newInventory = new Inventory();
                newInventory.setId(UUID.randomUUID().toString());
                newInventory.setProductId(productId);
                newInventory.setQuantity(0);
                return newInventory;
            });
        inventory.setQuantity(quantity);
        return inventoryRepository.save(inventory);
    }
}