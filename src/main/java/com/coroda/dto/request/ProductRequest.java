package com.coroda.dto.request;

import com.coroda.entity.Category;
import com.coroda.entity.OriginProduct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@ApiModel("Model Product")
public class ProductRequest {

    @ApiModelProperty(value = "id" , position = 1)
    private Long id;

//    @ApiModelProperty(value = "category", required = true , position = 2)
//    private String category; //puerta,equipo de seguridad ,motores ,sistemas
//
//    @ApiModelProperty(value = "subCategory", required = true , position = 3)
//    private String subCategory; //puerta garage, puer..  ,cercoelectrico , etc
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ApiModelProperty(position = 2)
    private List<CategoryRequest> model;

    @ApiModelProperty(value = "brand", required = true , position = 3)
    private String brand; // marca

    @ApiModelProperty(value = "description", required = true , position = 4)
    private String description;

    @ApiModelProperty(value = "origin", required = true , position = 5)
    private OriginProduct origin;// nacional o importado

    @ApiModelProperty(value = "material", required = true , position = 6)
    private String material;

    @ApiModelProperty(value = "dimensions", required = true , position = 9)
    private String dimensions;

    @ApiModelProperty(value = "color", required = true , position = 10)
    private String color;

    @ApiModelProperty(value = "priceUnit", required = true , position = 11)
    private BigDecimal priceUnit;

    @ApiModelProperty(value = "image", required = true , position = 12)
    private String image;
}
