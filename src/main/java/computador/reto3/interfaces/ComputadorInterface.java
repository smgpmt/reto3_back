
package computador.reto3.interfaces;

import computador.reto3.modelo.Computador;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author S.M.G.P
 */
public interface ComputadorInterface extends CrudRepository<Computador,Integer> {
    
}
