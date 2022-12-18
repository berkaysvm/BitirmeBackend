package com.example.backend.repository;

import com.example.backend.entities.FavoriteProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteProductRepository extends JpaRepository<FavoriteProductEntity,Long> {
}
