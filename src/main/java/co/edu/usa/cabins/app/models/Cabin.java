package co.edu.usa.cabins.app.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cabin")
public class Cabin implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer id;
    private String name;  

    @ManyToOne
    @JoinColumn(name="categoryId")   
    @JsonIgnoreProperties("cabins")   
    private Category category;
    private Integer rooms;
    private String brand;
}
