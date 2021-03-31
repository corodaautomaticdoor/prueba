package com.coroda.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "subCategory")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSubCategory")
    //identificador
    private Long IdSubCategory;

    @Column(name = "nameSubCategory")
    //puerta garage, puer..  ,cercoelectrico , etc
    private String nameSubCategory;

}
