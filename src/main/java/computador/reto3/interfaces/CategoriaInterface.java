
package computador.reto3.interfaces;

import computador.reto3.modelo.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author S.M.G.P
 */
public interface CategoriaInterface extends CrudRepository<Categoria,Integer> {
    
}
