package com.sam.marketplace.vendorhub.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.marketplace.vendorhub.entity.Cart;
import com.sam.marketplace.vendorhub.entity.User;

public interface CartRepository extends JpaRepository<Cart, UUID> {
  Optional<Cart> findByCustomer(User customer);
}
