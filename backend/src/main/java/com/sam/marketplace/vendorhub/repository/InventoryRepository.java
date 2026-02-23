package com.sam.marketplace.vendorhub.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.marketplace.vendorhub.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, UUID> {

}
