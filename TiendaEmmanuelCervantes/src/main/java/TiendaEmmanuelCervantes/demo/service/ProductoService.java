
package TiendaEmmanuelCervantes.demo.service;

import TiendaEmmanuelCervantes.demo.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    //SE OBTIENE UN LISTADO DE CATEGORIAS EN UN LIST
    public List<Producto> getProductos(boolean activo);
    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
    
    
}//INTERFACE END