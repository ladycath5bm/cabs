package co.edu.usa.cabins.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.usa.cabins.app.models.Reservation;
import co.edu.usa.cabins.app.repository.crud.ReservationCrudRepository;

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCrudRepository repository;

    /**
     * @return
     */
    public List<Reservation> findAll() {
        return (List<Reservation>) repository.findAll();
    }

    /**
     * @param id
     * @return
     * metodo para encontrar una cabania por su id
     */
    public Reservation findById(Integer id) {
        return repository.findById(id).orElse(null);
    }
    
    public Reservation save(Reservation reservation) {
        return repository.save(reservation);
    }

    public void delete(Reservation reservation) {
        repository.delete(reservation);
    }
}
