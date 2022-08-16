package co.edu.usa.cabins.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.usa.cabins.app.models.Category;
import co.edu.usa.cabins.app.repository.crud.CategoryCrudRepository;

public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository repository;

    
    public List<Category> findAll() {
        return (List<Category>) repository.findAll();
    }

    public Category findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Category save(Category category) {
        return repository.save(category);
    }

    public void delete(Category category) {
        repository.delete(category);
    }
}
