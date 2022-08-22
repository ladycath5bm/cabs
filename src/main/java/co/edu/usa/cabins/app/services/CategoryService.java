package co.edu.usa.cabins.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.cabins.app.models.Category;
import co.edu.usa.cabins.app.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> getAll() {
        return repository.findAll();
    }

    public Category getById(Category category) {
        return repository.findById(category.getId());
    }

    public Category save(Category category) {
        if (category.getId() == null) {
            return repository.save(category);
        } else {
            if (repository.findById(category.getId()) == null) {
                return repository.save(category);
            } else {
                return category;
            }
        }
    }
    
}
