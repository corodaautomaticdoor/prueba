package com.coroda.dto.response;

import com.coroda.entity.OriginProduct;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private Long id;
//    private String category;
//    private String subCategory;
    private List<CategoryResponse> model;
    private String brand;
    private String description;
    private OriginProduct origin;
    private String material;
    private String dimensions;
    private String color;
    private BigDecimal priceUnit;
    private String image;

}
