package service;

import bo.UsuarioBO;
import grpc.Usuario.GetByUsuarioYClaveRequest;
import grpc.Usuario.GetUsuarioRequest;
import grpc.Usuario.UsuarioDTO;
import grpc.Usuario.UsuarioObjDTO;
import grpc.Usuario.UsuarioServerResponse;
import grpc.UsuarioServiceGrpc.UsuarioServiceImplBase;
import io.grpc.stub.StreamObserver;
import model.Usuario;

public class UsuarioService extends UsuarioServiceImplBase{
    public UsuarioBO usuarioBO = UsuarioBO.getInstance();
	
	// METODO addUsuario
	@Override
	public void addUsuario(UsuarioDTO request, StreamObserver<UsuarioObjDTO> responseObserver){
		UsuarioObjDTO.Builder response = UsuarioObjDTO.newBuilder();
        UsuarioServerResponse.Builder serverResponse = UsuarioServerResponse.newBuilder();
        try {
            Usuario usuario = usuarioBO.agregarUsuario(request);
            response.setUsuario(mapUsuarioDTO(usuario));
            serverResponse.setCode(200);
            serverResponse.setMsg("Usuario guardado");
        } catch (Exception e) {
            serverResponse.setCode(500);
            serverResponse.setMsg(e.getMessage());
        }
        response.setServerResponse(serverResponse);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
	public void getUsuario(GetUsuarioRequest request, StreamObserver<UsuarioObjDTO> responseObserver) {

		Usuario usuario = null;
		UsuarioServerResponse.Builder serverResponse = UsuarioServerResponse.newBuilder();
		UsuarioObjDTO.Builder response = UsuarioObjDTO.newBuilder();

		try{
			usuario = usuarioBO.getById(request.getIdUsuario());
			response.setUsuario(mapUsuarioDTO(usuario));
			serverResponse.setCode(200);
			serverResponse.setMsg("Usuario encontrado");
		} // end_try
		catch(Exception e){
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		} // end_catch

		response.setServerResponse(serverResponse);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();

	}

	// METODO getByUsuarioYClaveRequest
	@Override
	public void getByUsuarioYClaveRequest(GetByUsuarioYClaveRequest request, StreamObserver<UsuarioObjDTO> responseObserver) {
		
		String nombreUsuario = request.getUsuario();
		String clave = request.getClave();
		
		System.out.println("Llamada al servicio getByUsuarioYClaveRequest con nombre de usuario: "+ nombreUsuario + " y clave " + clave);
		Usuario usuario = null;
		
		UsuarioServerResponse.Builder serverResponse = UsuarioServerResponse.newBuilder();
		UsuarioObjDTO.Builder response = UsuarioObjDTO.newBuilder();
		
		try{
			usuario = usuarioBO.getUsuarioByUsuarioYClave(nombreUsuario, clave);
            response.setUsuario(mapUsuarioDTO(usuario));
            serverResponse.setCode(200);
            serverResponse.setMsg("Usuario encontrado");
		} // end_try
		catch(Exception e){
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		} // end_catch
		
		response.setServerResponse(serverResponse);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	} // end_getByUsuarioYClaveRequest

    // MAPEOS

	public UsuarioDTO.Builder mapUsuarioDTO (Usuario u){
		UsuarioDTO.Builder dto = UsuarioDTO.newBuilder();
		dto.setIdUsuario((int)u.getIdUsuario());
		dto.setNombre(u.getNombre());
		dto.setApellido(u.getApellido());
		dto.setEmail(u.getEmail());
		dto.setUsuario(u.getUsuario());
		dto.setClave(u.getClave());
		return dto;
	} // end_mapUsuarioToDTO
	
	public Usuario mapDTOToUsuario (UsuarioDTO dto) throws Exception{		
		Usuario u = new Usuario();
		u.setIdUsuario(dto.getIdUsuario());
		u.setNombre(dto.getNombre());
		u.setApellido(dto.getApellido());
		u.setEmail(dto.getEmail());
		u.setUsuario(dto.getUsuario());
		u.setClave(dto.getClave());
		return u;
	} // end_mapDTOToUsuario
}
