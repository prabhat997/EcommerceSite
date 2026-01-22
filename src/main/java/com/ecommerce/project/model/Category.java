package com.ecommerce.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//below are the three annotations using Lombok dependency

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Category {

    private  Long categoryId;
    private String categoryName;

}
