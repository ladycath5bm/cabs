package co.edu.usa.cabins.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.usa.cabins.app.models.Admin;
import co.edu.usa.cabins.app.repository.crud.AdminCrudRepository;

@Repository
public class AdminRepository {

    @Autowired
    private AdminCrudRepository repository;

    /**
     * @return
     */
    public List<Admin> findAll() {
        return (List<Admin>) repository.findAll();
    }

    /**
     * @param id
     * @return
     * metodo para 
     */
    public Admin findById(Integer id) {
        return repository.findById(id).orElse(null);
    }
    
    public Admin save(Admin admin) {
        return repository.save(admin);
    }

    public void delete(Admin admin) {
        repository.delete(admin);
    }
    
}
