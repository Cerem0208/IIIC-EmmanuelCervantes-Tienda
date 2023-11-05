
package TiendaEmmanuelCervantes.demo.service;

import TiendaEmmanuelCervantes.demo.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    //SE OBTIENE UN LISTADO DE CATEGORIAS EN UN LIST
    public List<Producto> getProductos(boolean activos);
    
    // Se obtiene un Categoria, a partir del id de un categoria
    public Producto getProducto(Producto categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Producto producto);
    
}//INTERFACE END