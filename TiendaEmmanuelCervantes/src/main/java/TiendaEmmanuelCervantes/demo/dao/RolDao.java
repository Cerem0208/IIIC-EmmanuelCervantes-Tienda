package TiendaEmmanuelCervantes.demo.dao;

import TiendaEmmanuelCervantes.demo.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolDao extends JpaRepository<Rol, Long>{
    
}
