package com.coroda.entity;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //identificador
    private Long id;

////    @Column(name = "category")
//    //puerta,equipo de seguridad ,motores ,sistemas
//    private String category;
//
////    @Column(name = "subCategory")
//    //puerta garage, puer..  ,cercoelectrico , etc
//    private String subCategory;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "model")
//    @Column(name = "model")
    //PG01 ,PC01 ,...
//    private String model;
    private List<Category> model;

    @Column(name = "brand")
    //marca
    private String brand;

    @Column(name = "description")
    private String description;

    @Column(name = "origin")
    //nacional , importado
    private OriginProduct origin;

    @Column(name = "material")
    //madera , metal
    private String material;

    @Column(name = "dimensions")
    private String dimensions;

    @Column(name = "color")
    private String color;

    @Column(name = "priceUnit")
    private BigDecimal priceUnit;

    @Column(name = "image")
    private String image;
}
