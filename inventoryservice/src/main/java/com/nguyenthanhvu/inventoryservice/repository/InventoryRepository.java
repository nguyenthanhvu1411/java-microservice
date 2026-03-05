package com.nguyenthanhvu.inventoryservice.repository;

import com.nguyenthanhvu.inventoryservice.model.Inventory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
public interface InventoryRepository extends JpaRepository<Inventory, String> {
     Optional<Inventory> findByProductId(String productId);
}