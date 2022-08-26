package co.edu.usa.cabins.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.cabins.app.models.Client;
import co.edu.usa.cabins.app.repository.ClientRepository;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository repository;

    public List<Client> getAll() {
        return repository.findAll();
    }

    public Client getById(Integer id) {
        return repository.findById(id);
    }

    public Client save(Client client) {
        if (client.getIdClient() == null) {
            return repository.save(client);
        } else {
            if (repository.findById(client.getIdClient()) == null) {
                return repository.save(client);
            } else {
                return client;
            }
        }
    }

    public Client update(Client client){
        if(client.getIdClient() != null){
            Client newClient = repository.findById(client.getIdClient());
            if(newClient != null){
                if(client.getName() != null){
                    newClient.setName(client.getName());
                }
                if (client.getAge() != null) {
                    newClient.setAge(client.getAge());
                }
                if (client.getEmail() != null) {
                    newClient.setEmail(client.getEmail());
                }
                if (client.getPassword() != null) {
                    newClient.setPassword(client.getPassword());
                }

                return repository.save(newClient);
            }else{
                return client;
            }
        }else{
            return client;
        }
    }
    
    public void delete(Client client) {
        repository.delete(client);
    }    
}
