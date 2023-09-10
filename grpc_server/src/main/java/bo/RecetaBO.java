package bo;

import java.util.List;

import dao.RecetaDAO;
import grpc.Receta.RecetaDTO;
import model.Receta;


public class RecetaBO {
    private static RecetaBO instancia;

	public static RecetaBO getInstance() {
		if(instancia == null) {
			instancia = new RecetaBO();
		} // end_if
		return instancia;
	} // end_CategoriaBO
	
    RecetaDAO recetaDAO = RecetaDAO.getInstance();
    UsuarioBO usuarioBO = UsuarioBO.getInstance();
    CategoriaBO categoriaBO = CategoriaBO.getInstance();
 
	// METODO agregarCategoria
    public Receta agregarReceta(RecetaDTO recetaDTO) throws Exception {
        Receta toPersist = mapRecetaToEntity(recetaDTO);
        Receta persisted = recetaDAO.agregarReceta(toPersist);
        return persisted;
    }
    
    // METODO getById
	public Receta getById (int idReceta) throws Exception{
		return recetaDAO.getById(idReceta);
	}
	
	public List<Receta> getAll() throws Exception{
        return RecetaDAO.getInstance().getAll();
    }


    private Receta mapRecetaToEntity (RecetaDTO dto) throws Exception{
        Receta u = new Receta();
        u.setIdReceta(dto.getIdReceta());
        u.setNombre(dto.getNombre());
        u.setUsuario(usuarioBO.getById(dto.getIdUsuario()));
        u.setCategoria(categoriaBO.getById(dto.getIdCategoria()));
        return u;
    }
        
}
