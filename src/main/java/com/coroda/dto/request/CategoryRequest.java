package com.coroda.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@ApiModel("Model Category")
public class CategoryRequest {

    @ApiModelProperty(value = "categoryId" , position = 1)
    private Long categoryId;

    @ApiModelProperty(value = "model" , position = 2)
    private String model;

    @ApiModelProperty(value = "nameCategory" , position = 3)
    private String nameCategory;

    @ApiModelProperty(value = "SubCategory" ,position = 4)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SubCategoryRequest> SubCategory;

}
