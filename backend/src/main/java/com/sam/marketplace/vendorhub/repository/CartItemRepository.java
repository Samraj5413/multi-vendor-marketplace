package com.sam.marketplace.vendorhub.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.marketplace.vendorhub.entity.Cart;
import com.sam.marketplace.vendorhub.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, UUID> {
  List<CartItem> findByCart(Cart cart);
}
