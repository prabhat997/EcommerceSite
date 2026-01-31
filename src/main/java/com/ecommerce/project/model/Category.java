package com.ecommerce.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok is a Java library that removes boilerplate code like getters, setters, constructors, toString(),etc.
// It’s especially useful in Spring Boot projects


@Entity(name = "categories")
//Lombok annotation start
@Data
@NoArgsConstructor
@AllArgsConstructor
//Lombok annotation end

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long categoryId;

    // validation annotation
    @NotBlank
    @Size(min=3, message = "Category name must contain atleast 3 characters")

    private String categoryName;

}
