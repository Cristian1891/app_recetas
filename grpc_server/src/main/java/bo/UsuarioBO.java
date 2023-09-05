package bo;


import grpc.Usuario.UsuarioDTO;
import dao.UsuarioDAO;
import model.Usuario;

// import grpc.Usuario.UsuarioDTO;

public class UsuarioBO {
    private static UsuarioBO instancia;

	public static UsuarioBO getInstance() {
		if(instancia == null) {
			instancia = new UsuarioBO();
		} // end_if
		return instancia;
	} // end_UsuarioBO
	
    UsuarioDAO usuarioDAO = UsuarioDAO.getInstance();
    // ProductoDAO productoDAO = ProductoDAO.getInstance();

	// METODO agregarUsuario
    public Usuario agregarUsuario(UsuarioDTO usuarioDTO) throws Exception {
        Usuario toPersist = mapUsuarioToEntity(usuarioDTO);
        Usuario persisted = usuarioDAO.agregarUsuario(toPersist);
        return persisted;
    }
    
    // METODO getById
	public Usuario getById (int idUsuario) throws Exception{
		return usuarioDAO.getById(idUsuario);
	}

	// METODO getUsuarioByUsuarioYClave
	public Usuario getUsuarioByUsuarioYClave(String nombreUsuario, String clave) throws Exception{
		Usuario usuario = null;
		try{
			usuario = usuarioDAO.getUsuarioByUsuarioYClave(nombreUsuario, clave);
			return usuario;		
		} // end_try
		catch (Exception e){
			System.out.println(e.getMessage());
			throw new Exception ("ATENCION: Error, no se pudo recuperar el usuario por nombre de usuario y clave");
		} // end_catch
	} // end_getUsuarioByUsuarioYClave

    private Usuario mapUsuarioToEntity (UsuarioDTO dto) throws Exception{
        Usuario u = new Usuario();
        u.setIdUsuario(dto.getIdUsuario());
        u.setNombre(dto.getNombre());
        u.setApellido(dto.getApellido());
        u.setEmail(dto.getEmail());
        u.setUsuario(dto.getUsuario());
        u.setClave(dto.getClave());
        return u;
    }
}
