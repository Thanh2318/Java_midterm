package com.example.SpringEmmerce.repository;

import com.example.SpringEmmerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
