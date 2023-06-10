package com.example.backend.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Entity
@Table(name = "information")
@Data
public class UserInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastname;
    private int age;
    private String phoneNumber;
    private String address1;
    private String adress2;
    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;
    private String postaKodu;
    private String eMail;
    private String password;
    private String location;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryCounter", referencedColumnName = "id")
    private UserCategoryCounter userCategoryCounter;

    @OneToMany(mappedBy = "userInformation", targetEntity = OrderEntity.class )
    private List<OrderEntity> orderEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "favoriteProductList",referencedColumnName = "id")
    private FavoriteProductEntity favoriteProductEntity;

    @OneToMany(mappedBy = "user")
    private List<ProductEntity> productEntityList;

}
