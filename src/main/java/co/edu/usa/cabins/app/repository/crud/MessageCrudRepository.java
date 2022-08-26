package co.edu.usa.cabins.app.repository.crud;

import org.springframework.data.repository.CrudRepository;

import co.edu.usa.cabins.app.models.Message;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
    
}
