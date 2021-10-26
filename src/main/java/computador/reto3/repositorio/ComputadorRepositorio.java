/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computador.reto3.repositorio;

import computador.reto3.interfaces.ComputadorInterface;
import computador.reto3.modelo.Computador;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author S.M.G.P
 */
@Repository
public class ComputadorRepositorio {
    @Autowired
    private ComputadorInterface crud;
    
    public List<Computador> getAll(){
        return (List<Computador>) crud.findAll();       
    }
    
    public Optional <Computador> getComputer(int id){
        return crud.findById(id);
    }
    
    public Computador save(Computador computador){
        return crud.save(computador);
    }
     public void delete(Computador computador){
        crud.delete(computador);
    }
    
}

