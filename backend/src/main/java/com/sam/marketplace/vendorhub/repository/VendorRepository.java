package com.sam.marketplace.vendorhub.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.marketplace.vendorhub.entity.User;
import com.sam.marketplace.vendorhub.entity.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, UUID> {
  Optional<Vendor> findByStoreName(String storename);

  Optional<Vendor> findByUser(User user);
}
