package co.edu.usa.cabins.app.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cabin {
    private Integer id;
    private String name;        
    private Integer category_id;
    private Integer rooms;
    private String brand;
}
