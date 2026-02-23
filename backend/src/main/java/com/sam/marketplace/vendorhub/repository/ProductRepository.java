package com.sam.marketplace.vendorhub.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.marketplace.vendorhub.entity.Category;
import com.sam.marketplace.vendorhub.entity.Product;
import com.sam.marketplace.vendorhub.entity.Vendor;

public interface ProductRepository extends JpaRepository<Product, UUID> {
  List<Product> findByVendor(Vendor vendor);

  List<Product> findByCategory(Category category);

  List<Product> findByNameContainingIgnoreCase(String name);
}
