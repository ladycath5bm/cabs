package co.edu.usa.cabins.app.repository.crud;

import org.springframework.data.repository.CrudRepository;

import co.edu.usa.cabins.app.models.Reservation;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
    
}
