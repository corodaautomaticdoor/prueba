package com.coroda.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@ApiModel("Model SubCategory")
public class SubCategoryRequest {

    @ApiModelProperty(value = "IdSubCategory" , position = 4)
    private Long IdSubCategory;

    @ApiModelProperty(value = "subCategory" , position = 5)
    private String nameSubCategory;

}
