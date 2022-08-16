package co.edu.usa.cabins.app.repository.crud;

import org.springframework.data.repository.CrudRepository;

import co.edu.usa.cabins.app.models.Category;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
    
}
