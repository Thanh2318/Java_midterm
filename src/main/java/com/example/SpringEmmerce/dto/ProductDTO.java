package com.example.SpringEmmerce.dto;

import com.example.SpringEmmerce.model.Category;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private int categoryId;
    private double price;
    private String brand;
    private String color;
    private String imageName;
}
