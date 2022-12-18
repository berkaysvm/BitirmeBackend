package com.example.backend.repository;

import com.example.backend.entities.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<BrandEntity,Integer> {
}
