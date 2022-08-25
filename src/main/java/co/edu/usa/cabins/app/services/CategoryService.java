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

    public Category getById(Integer id) {
        return repository.findById(id);
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

    public Category update(Category category){
        if(category.getId() != null){
            Category newCategory = repository.findById(category.getId());
            if(newCategory != null){
                if(category.getName() != null) {
                    newCategory.setName(category.getName());
                }
                if(category.getDescription() != null){
                    newCategory.setDescription(category.getDescription());
                }
                return repository.save(newCategory);
            }else{
                return category;
            }
        }else{
            return category;
        }
    }
    
    public void delete(Category category) {
        repository.delete(category);
    }
}
