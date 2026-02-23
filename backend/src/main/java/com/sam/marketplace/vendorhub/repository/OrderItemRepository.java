package com.sam.marketplace.vendorhub.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.marketplace.vendorhub.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> {

}
