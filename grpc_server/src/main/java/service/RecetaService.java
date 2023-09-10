package service;

import bo.CategoriaBO;
import bo.RecetaBO;
import bo.UsuarioBO;
import grpc.Receta.GetRecetaRequest;
import grpc.Receta.RecetaDTO;
import grpc.Receta.RecetaObjDTO;
import grpc.Receta.RecetaServerResponse;
import grpc.RecetaServiceGrpc.RecetaServiceImplBase;
import io.grpc.stub.StreamObserver;
import model.Receta;


public class RecetaService extends RecetaServiceImplBase{
    public RecetaBO recetaBO = RecetaBO.getInstance();
    public UsuarioBO usuarioBO = UsuarioBO.getInstance();
    public CategoriaBO categoriaBO = CategoriaBO.getInstance();

    @Override
    public void addReceta(RecetaDTO request, StreamObserver<RecetaObjDTO> responseObserver) {
        RecetaObjDTO.Builder response = RecetaObjDTO.newBuilder();
        RecetaServerResponse.Builder serverResponse = RecetaServerResponse.newBuilder();
        try {
            Receta receta = recetaBO.agregarReceta(request);
            response.setReceta(mapRecetaDTO(receta));
            serverResponse.setCode(200);
            serverResponse.setMsg("Receta guardada");
        } catch (Exception e) {
            serverResponse.setCode(500);
            serverResponse.setMsg(e.getMessage());
        }
        response.setServerResponse(serverResponse);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getReceta(GetRecetaRequest request, StreamObserver<RecetaObjDTO> responseObserver) {
        Receta receta = null;
		RecetaServerResponse.Builder serverResponse = RecetaServerResponse.newBuilder();
		RecetaObjDTO.Builder response = RecetaObjDTO.newBuilder();

		try{
			receta = recetaBO.getById(request.getIdReceta());
			response.setReceta(mapRecetaDTO(receta));
			serverResponse.setCode(200);
			serverResponse.setMsg("Receta encontrada");
		} // end_try
		catch(Exception e){
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		} // end_catch

		response.setServerResponse(serverResponse);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
    }

    // MAPEOS

	public RecetaDTO.Builder mapRecetaDTO (Receta u){
		RecetaDTO.Builder dto = RecetaDTO.newBuilder();
		dto.setIdReceta((int)u.getIdReceta());
		dto.setNombre(u.getNombre());
        dto.setIdUsuario(u.getUsuario().getIdUsuario());
        dto.setIdCategoria(u.getCategoria().getIdCategoria());
		return dto;
	} // end_mapCategoriaToDTO
	
	public Receta mapDTOToReceta (RecetaDTO dto) throws Exception{		
		Receta u = new Receta();
		u.setIdReceta(dto.getIdReceta());
		u.setNombre(dto.getNombre());
        u.setUsuario(usuarioBO.getById(dto.getIdUsuario()));
        u.setCategoria(categoriaBO.getById(dto.getIdCategoria()));
		return u;
	} // end_mapDTOToCategoria
    
}
