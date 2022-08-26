package co.edu.usa.cabins.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.usa.cabins.app.models.Client;
import co.edu.usa.cabins.app.repository.crud.ClientCrudRepository;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCrudRepository repository;

    /**
     * @return
     */
    public List<Client> findAll() {
        return (List<Client>) repository.findAll();
    }

    /**
     * @param id
     * @return
     * metodo para encontrar una cabania por su id
     */
    public Client findById(Integer id) {
        return repository.findById(id).orElse(null);
    }
    
    public Client save(Client client) {
        return repository.save(client);
    }

    public void delete(Client client) {
        repository.delete(client);
    }
}
