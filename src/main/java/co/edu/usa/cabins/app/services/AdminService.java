package co.edu.usa.cabins.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.cabins.app.models.Admin;
import co.edu.usa.cabins.app.repository.AdminRepository;

@Service
public class AdminService {
    
    @Autowired
    private AdminRepository repository;

    public List<Admin> getAll() {
        return repository.findAll();
    }

    public Admin getById(Integer id) {
        return repository.findById(id);
    }

    public Admin save(Admin admin) {
        if (admin.getIdAdmin() == null) {
            return repository.save(admin);
        } else {
            if (repository.findById(admin.getIdAdmin()) == null) {
                return repository.save(admin);
            } else {
                return admin;
            }
        }
    }

    public Admin update(Admin admin){
        /* if(admin.getIdAdmin() != null){
            Admin newAdmin = repository.findById(admin.getIdAdmin());
            if(newAdmin != null){
                if(admin.getName() != null) {
                    newAdmin.setName(admin.getName());
                }
                if(admin.getDescription() != null){
                    newAdmin.setDescription(admin.getDescription());
                }
                return repository.save(newAdmin);
            }else{
                return admin;
            }
        }else{
            return admin;
        } */
        return admin;
    }
    
    public void delete(Admin admin) {
        repository.delete(admin);
    }
}
