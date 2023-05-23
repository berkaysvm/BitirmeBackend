package com.example.backend.repository;

import com.example.backend.entities.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeRepository extends JpaRepository<SizeEntity,Integer> {
}
