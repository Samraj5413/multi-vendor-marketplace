package com.sam.marketplace.vendorhub.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.marketplace.vendorhub.entity.Order;
import com.sam.marketplace.vendorhub.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {

  Optional<Payment> findByOrder(Order order);

  Optional<Payment> findByTransactionId(String transactionId);
}
