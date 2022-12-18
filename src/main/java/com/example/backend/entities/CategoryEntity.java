package com.example.backend.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "category")
public class CategoryEntity {



        @GeneratedValue(strategy = GenerationType.AUTO)
        @Id
        private int id;
        private String categoryName;

//        @OneToMany(mappedBy = "category",targetEntity = CategoryEntity.class , cascade = CascadeType.MERGE)
//        private List<Subcategory> subcategoryList;


    }

