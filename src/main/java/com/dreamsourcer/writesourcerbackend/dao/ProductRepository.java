package com.dreamsourcer.writesourcerbackend.dao;

import com.dreamsourcer.writesourcerbackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
