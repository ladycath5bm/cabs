package co.edu.usa.cabins.app.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation implements Serializable{

    private static final long serialVersionUID = 5L;

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer idReservation;
    private String startDate;
    private String devolutionDate;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties(value = {"reservations"})
    private Client client;

    @ManyToOne
    @JoinColumn(name = "cabinId")
    @JsonIgnoreProperties(value = {"reservations"})
    private Cabin cabin;
    
}
