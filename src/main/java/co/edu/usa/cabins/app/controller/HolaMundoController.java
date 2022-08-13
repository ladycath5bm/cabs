package co.edu.usa.cabins.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usa.cabins.app.models.Cabin;

@RestController
@RequestMapping("/hola-mundo")
public class HolaMundoController {
    
    @GetMapping("/")
    public String holaMundo() {
        Cabin newCabin = new Cabin();

        Cabin newCb = new Cabin();
        newCb.setName("nuevca cabania");
        return newCb.toString();
    }

}
