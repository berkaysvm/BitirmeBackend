package com.example.backend.repository;

import com.example.backend.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {

}
