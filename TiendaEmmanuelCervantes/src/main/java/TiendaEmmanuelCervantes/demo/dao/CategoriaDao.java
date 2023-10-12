package TiendaEmmanuelCervantes.demo.dao;

import TiendaEmmanuelCervantes.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria,Long>{
    
}//INTERFACE END
