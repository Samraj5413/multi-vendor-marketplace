package com.sam.marketplace.vendorhub.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.marketplace.vendorhub.entity.Order;
import com.sam.marketplace.vendorhub.entity.OrderStatus;
import com.sam.marketplace.vendorhub.entity.User;

public interface OrderRepository extends JpaRepository<Order, UUID> {
  List<Order> findByCustomer(User customer);

  List<Order> findByStatus(OrderStatus status);
}
