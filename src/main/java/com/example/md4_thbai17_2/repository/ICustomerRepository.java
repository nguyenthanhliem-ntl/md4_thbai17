package com.example.md4_thbai17_2.repository;

import com.example.md4_thbai17_2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
