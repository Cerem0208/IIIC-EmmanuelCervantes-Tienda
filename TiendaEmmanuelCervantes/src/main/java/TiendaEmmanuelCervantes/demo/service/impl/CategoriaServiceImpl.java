package TiendaEmmanuelCervantes.demo.service.impl;

import TiendaEmmanuelCervantes.demo.dao.CategoriaDao;
import TiendaEmmanuelCervantes.demo.domain.Categoria;
import TiendaEmmanuelCervantes.demo.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service

public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriaDao categoriaDao;
    @Override
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias(boolean activos) {
        var lista=categoriaDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }//IF END
        return lista;
    }//LIST END
    
    @Override
    @Transactional(readOnly = true)
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }//GETCATEGORIA END
    
    @Override
    @Transactional
    public void save(Categoria categoria){
        categoriaDao.save(categoria);
    }//SAVE END
    
    @Override
    @Transactional
    public void delete(Categoria categoria){
        categoriaDao.delete(categoria);
    }//DELETE END
}//CLASS END