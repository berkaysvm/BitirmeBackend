package com.example.backend.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "user_category_counter")
public class UserCategoryCounter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserInformation user;
    private int technology;
    private int clothes;
    private int accessory;
    private int hobby;
    private int sport;


}
