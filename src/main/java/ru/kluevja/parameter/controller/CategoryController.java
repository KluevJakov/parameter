package ru.kluevja.parameter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kluevja.parameter.entity.Category;
import ru.kluevja.parameter.service.CategoryService;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/categories")
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    private List<Category> getCategories() {
        return new ArrayList<>();
    }

    @PostMapping
    private Category createCategory(@RequestBody Category category) {
        return new Category();
    }

    @GetMapping("/{id}")
    private Category getCategory() {
        return new Category();
    }

    @PutMapping("/{id}")
    private Category editCategory() {
        return new Category();
    }

    @DeleteMapping("/{id}")
    private Category deleteCategory() {
        return new Category();
    }
}
