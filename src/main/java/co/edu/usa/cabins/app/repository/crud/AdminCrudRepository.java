package co.edu.usa.cabins.app.repository.crud;

import org.springframework.data.repository.CrudRepository;

import co.edu.usa.cabins.app.models.Admin;

public interface AdminCrudRepository extends CrudRepository<Admin, Integer> {
    
}
