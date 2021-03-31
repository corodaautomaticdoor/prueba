package com.coroda.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryResponse {

    private Long IdSubCategory;
    private String nameSubCategory;

}
