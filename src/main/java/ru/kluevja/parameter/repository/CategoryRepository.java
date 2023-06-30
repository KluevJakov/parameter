package ru.kluevja.parameter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.kluevja.parameter.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}