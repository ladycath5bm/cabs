package co.edu.usa.cabins.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usa.cabins.app.models.Category;
import co.edu.usa.cabins.app.services.CategoryService;

@RestController
@RequestMapping("/Category")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryController {
    
    @Autowired
    private CategoryService service;

    @GetMapping("/all")
    public List<Category> getAll() {
        return service.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category) {
        return service.save(category);
    }

    @GetMapping("/{id}")
    public Category getById(@PathVariable("id") Integer id){ //}, @RequestHeader Headers headers) {
        return service.getById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Category update(@RequestBody Category category) {
        return service.update(category);
    }
}
