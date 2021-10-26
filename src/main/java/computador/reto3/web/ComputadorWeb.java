/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computador.reto3.web;

import computador.reto3.modelo.Computador;
import computador.reto3.servicios.ComputadorServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author S.M.G.P
 */
@RestController
@RequestMapping("/api/Computer")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ComputadorWeb {
    
    
    //@GetMapping("/holaMundo")
    //public String saludad(){
    //return "Hola Mundo Tutoria";
    //}

    @Autowired
    private ComputadorServicio servicio;
    @GetMapping("all")
    public List <Computador> getComputer(){
        return servicio.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Computador> getComputer(@PathVariable("id") int idComputador) {
        return servicio.getComputer(idComputador);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computador save(@RequestBody Computador computador) {
        return servicio.save(computador);
    }
    
     @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Computador update(@RequestBody Computador computador) {
        return servicio.update(computador);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int idComputador) {
        return servicio.deleteComputer(idComputador);
    }
}
