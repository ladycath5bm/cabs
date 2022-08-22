package co.edu.usa.cabins.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.cabins.app.models.Cabin;
import co.edu.usa.cabins.app.repository.CabinRepository;

@Service
public class CabinService {

    @Autowired
    private CabinRepository repository;

    public List<Cabin> getAll() {
        return repository.findAll();
    }
    
    public Cabin getById(Integer id) {
        return repository.findById(id);
    }

    public Cabin save(Cabin cabin) {
        if (cabin.getId() == null) {
            return repository.save(cabin);
        } else {
            if (repository.findById(cabin.getId()) == null) {
                return repository.save(cabin);
            } else {
                return cabin;
            }
        }
    }

    public Cabin update(Cabin cabin) {
         if (cabin.getId() != null) {
            if (repository.findById(cabin.getId()) != null) {
                //hacer validaciones antes de save hacer el de category y agregar validaciones, crear na capa de reglas de validación
                return repository.save(cabin);
            } else {
                return cabin;
            }
        } else {
            return cabin;
        }
    }

    /* public Cabin update(Cabin cabin) {
        if(cabin.getId() != null) {
            Optional<Cabin> e = repository.findById(cabin.getId()); 
            if (!e.isEmpty()) {
                if(cabin.getBrand() != null){
                    e.get().setBrand(cabin.getBrand());
                }
                if(cabin.getRooms() != null){
                    e.get().setRooms(cabin.getRooms());
                }
                repository.save(e.get());
                return e.get();
            }else{
                return cabin;
            }
        }else{
            return cabin;
        }
    } */

    public void delete(Cabin cabin) {
        repository.delete(cabin);
    }
}