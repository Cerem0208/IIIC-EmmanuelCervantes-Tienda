package TiendaEmmanuelCervantes.demo.service;

import TiendaEmmanuelCervantes.demo.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //SE OBTIENE UN LISTADO DE CATEGORIAS EN UN LIST
    public List<Categoria> getCategorias(boolean activos);
    
}//INTERFACE END
