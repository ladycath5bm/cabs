package co.edu.usa.cabins.app.repository.crud;

import org.springframework.data.repository.CrudRepository;

import co.edu.usa.cabins.app.models.Cabin;

public interface CabinCrudRepository extends CrudRepository<Cabin, Integer>{
    
}
