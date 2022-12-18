package com.example.backend.repository;

import com.example.backend.entities.ProductEntity;
import com.example.backend.entities.ProductStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface ProductStatusRepository extends JpaRepository<ProductStatus, Integer> {
}
