package com.javaproject.javaBack0.repository;

import com.javaproject.javaBack0.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {
}
