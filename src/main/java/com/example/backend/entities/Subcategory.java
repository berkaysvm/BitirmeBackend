package com.example.backend.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "sub_category")
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   // @OneToOne(mappedBy ="sub_category")
   // private CategoryEntity categoryEntity;

    private String subCategoryName;

    //@OneToMany(mappedBy = "sub_category",cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
   // private List<ProductEntity> productEntityList;
}
