package bo;

import java.util.List;

import dao.CategoriaDAO;
import grpc.Categoria.CategoriaDTO;
import model.Categoria;

public class CategoriaBO {
    private static CategoriaBO instancia;

	public static CategoriaBO getInstance() {
		if(instancia == null) {
			instancia = new CategoriaBO();
		} // end_if
		return instancia;
	} // end_CategoriaBO
	
    CategoriaDAO categoriaDAO = CategoriaDAO.getInstance();
 
	// METODO agregarCategoria
    public Categoria agregarCategoria(CategoriaDTO categoriaDTO) throws Exception {
        Categoria toPersist = mapCategoriaToEntity(categoriaDTO);
        Categoria persisted = categoriaDAO.agregarCategoria(toPersist);
        return persisted;
    }
    
    // METODO getById
	public Categoria getById (int IdCategoria) throws Exception{
		return categoriaDAO.getById(IdCategoria);
	}
	
	public List<Categoria> getAll() throws Exception{
        return CategoriaDAO.getInstance().getAll();
    }


    private Categoria mapCategoriaToEntity (CategoriaDTO dto) throws Exception{
        Categoria u = new Categoria();
        u.setIdCategoria(dto.getIdCategoria());
        u.setNombre(dto.getNombre());
        return u;
    }
}
