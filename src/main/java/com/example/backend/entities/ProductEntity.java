package com.example.backend.entities;


import com.example.backend.dto.OrderEntityDto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
@Data
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String color;
    private String explanation;
    private String price;
    //private List image;

    @ManyToOne
    @JoinColumn(name = "size")
    private SizeEntity size;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private BrandEntity brand;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private ProductStatus productStatus;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private OrderEntity orderEntity;
    @ManyToOne
    @JoinColumn(name = "userid",referencedColumnName = "id")
    private UserInformation user;
    @OneToMany(mappedBy = "productEntity",targetEntity = FavoriteProductEntity.class)
    private List<FavoriteProductEntity> favoriteProductEntities;
    private String location;
    private Date date;
    private Long favoriteCounter;
    private Long clickCounter;



//    @OneToOne(mappedBy = "product",cascade = CascadeType.MERGE)
//    private Subcategory category;

}
