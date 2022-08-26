package co.edu.usa.cabins.app.repository.crud;

import org.springframework.data.repository.CrudRepository;

import co.edu.usa.cabins.app.models.Client;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
    
}
