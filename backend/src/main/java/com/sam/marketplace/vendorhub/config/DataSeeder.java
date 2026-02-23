package com.sam.marketplace.vendorhub.config;

import com.sam.marketplace.vendorhub.entity.Role;
import com.sam.marketplace.vendorhub.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

  private final RoleRepository roleRepository;

  @Override
  public void run(String... args) {
    List<String> roleNames = List.of("ROLE_ADMIN", "ROLE_VENDOR", "ROLE_CUSTOMER");

    for (String name : roleNames) {
      if (roleRepository.findByName(name).isEmpty()) {
        roleRepository.save(Role.builder().name(name).build());
        System.out.println("Seeded role: " + name);
      }
    }
  }
}
