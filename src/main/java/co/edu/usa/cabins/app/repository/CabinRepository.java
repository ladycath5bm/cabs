package co.edu.usa.cabins.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.usa.cabins.app.models.Cabin;
import co.edu.usa.cabins.app.models.Category;
import co.edu.usa.cabins.app.repository.crud.CabinCrudRepository;

@Repository
public class CabinRepository {

    @Autowired
    private CabinCrudRepository repository;

    /**
     * @return
     */
    public List<Cabin> findAll() {
        return (List<Cabin>) repository.findAll();
    }

    /**
     * @param id
     * @return
     * metodo para encontrar una cabania por su id
     */
    public Cabin findById(Integer id) {
        return repository.findById(id).orElse(null);
    }
    
    public Cabin save(Cabin cabin) {
        return repository.save(cabin);
    }

    public void delete(Cabin cabin) {
        repository.delete(cabin);
    }

/*     public List<Cabin> findByCategory(Category category) {
        return repository.findByCategory(category);
    } */
}
