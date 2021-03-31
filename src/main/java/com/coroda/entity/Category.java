package com.coroda.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
//
    @Column(name = "model")
    private String model;

    @Column(name = "nameCategory")
    //puerta,equipo de seguridad ,motores ,sistemas
    private String nameCategory;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdSubCategory")
    private List<SubCategory> SubCategory;

}
