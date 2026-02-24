package com.sam.marketplace.vendorhub.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.marketplace.vendorhub.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
  Optional<User> findByEmail(String email);
}
