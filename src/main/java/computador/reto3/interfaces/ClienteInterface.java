/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package computador.reto3.interfaces;

import computador.reto3.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author S.M.G.P
 */
public interface ClienteInterface extends CrudRepository<Cliente,Integer> {
    
}
