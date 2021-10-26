/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computador.reto3.servicios;

import computador.reto3.modelo.Computador;
import computador.reto3.repositorio.ComputadorRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author S.M.G.P
 */
@Service
public class ComputadorServicio {
    @Autowired
    private ComputadorRepositorio metodosCrud;
    public List<Computador> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Computador> getComputer(int idcomputador){
        return metodosCrud.getComputer(idcomputador);
    }
    
    public Computador save(Computador computador){
        if(computador.getId()==null){
            return metodosCrud.save(computador);
        }else{
            Optional<Computador> evt=metodosCrud.getComputer(computador.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(computador);
            }else{
                return computador;
            }
        }
    }
    public Computador update(Computador computador){
        if(computador.getId()!=null){
            Optional<Computador> e=metodosCrud.getComputer(computador.getId());
            if(!e.isEmpty()){
                if(computador.getName()!=null){
                    e.get().setName(computador.getName());
                }
                if(computador.getBrand()!=null){
                    e.get().setBrand(computador.getBrand());
                }
                if(computador.getYear()!=null){
                    e.get().setYear(computador.getYear());
                }
                if(computador.getDescription()!=null){
                    e.get().setDescription(computador.getDescription());
                }
                if(computador.getCategory()!=null){
                    e.get().setCategory(computador.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return computador;
            }
        }else{
            return computador;
        }
    }


    public boolean deleteComputer(int computerId) {
        Boolean aBoolean = getComputer(computerId).map(computer -> {
            metodosCrud.delete(computer);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
    
}
    

