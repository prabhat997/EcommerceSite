package com.ecommerce.project.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok is a Java library that removes boilerplate code like getters, setters, constructors, toString(),etc.
// It’s especially useful in Spring Boot projects

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Category {

    private  Long categoryId;

    @NotBlank
    private String categoryName;

}
