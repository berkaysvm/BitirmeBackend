package com.example.backend.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
@Data
@Table(name= "size")
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String sizeName;

    @OneToMany(mappedBy = "size")
    private List<ProductEntity> productEntityList;





}
