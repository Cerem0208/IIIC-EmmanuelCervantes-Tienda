package TiendaEmmanuelCervantes.demo.dao;

import TiendaEmmanuelCervantes.demo.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto,Long>{
    
}//INTERFACE END
