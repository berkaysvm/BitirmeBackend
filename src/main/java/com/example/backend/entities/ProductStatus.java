package com.example.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "product_status")
public class ProductStatus {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String status;

   @OneToMany(mappedBy ="productStatus",targetEntity = com.example.backend.entities.ProductEntity.class)
   private List<ProductEntity> productEntityList;

}
