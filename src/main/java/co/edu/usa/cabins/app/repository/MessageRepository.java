package co.edu.usa.cabins.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.usa.cabins.app.models.Message;
import co.edu.usa.cabins.app.repository.crud.MessageCrudRepository;

@Repository
public class MessageRepository {

    @Autowired
    private MessageCrudRepository repository;

    /**
     * @return
     */
    public List<Message> findAll() {
        return (List<Message>) repository.findAll();
    }

    /**
     * @param id
     * @return
     * metodo para encontrar una cabania por su id
     */
    public Message findById(Integer id) {
        return repository.findById(id).orElse(null);
    }
    
    public Message save(Message message) {
        return repository.save(message);
    }

    public void delete(Message message) {
        repository.delete(message);
    }
}
