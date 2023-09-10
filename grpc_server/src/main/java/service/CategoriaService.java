package service;

import bo.CategoriaBO;
import grpc.Categoria.CategoriaDTO;
import grpc.Categoria.CategoriaObjDTO;
import grpc.Categoria.CategoriaServerResponse;
import grpc.Categoria.GetCategoriaRequest;
import grpc.CategoriaServiceGrpc.CategoriaServiceImplBase;
import io.grpc.stub.StreamObserver;
import model.Categoria;




public class CategoriaService extends CategoriaServiceImplBase {
    public CategoriaBO categoriaBO = CategoriaBO.getInstance();

    @Override
    public void addCategoria(CategoriaDTO request, StreamObserver<CategoriaObjDTO> responseObserver) {
        CategoriaObjDTO.Builder response = CategoriaObjDTO.newBuilder();
        CategoriaServerResponse.Builder serverResponse = CategoriaServerResponse.newBuilder();
        try {
            Categoria categoria = categoriaBO.agregarCategoria(request);
            response.setCategoria(mapCategoriaDTO(categoria));
            serverResponse.setCode(200);
            serverResponse.setMsg("Categoria guardada");
        } catch (Exception e) {
            serverResponse.setCode(500);
            serverResponse.setMsg(e.getMessage());
        }
        response.setServerResponse(serverResponse);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getCategoria(GetCategoriaRequest request, StreamObserver<CategoriaObjDTO> responseObserver) {
        Categoria categoria = null;
		CategoriaServerResponse.Builder serverResponse = CategoriaServerResponse.newBuilder();
		CategoriaObjDTO.Builder response = CategoriaObjDTO.newBuilder();

		try{
			categoria = categoriaBO.getById(request.getIdCategoria());
			response.setCategoria(mapCategoriaDTO(categoria));
			serverResponse.setCode(200);
			serverResponse.setMsg("Categoria encontrada");
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

	public CategoriaDTO.Builder mapCategoriaDTO (Categoria u){
		CategoriaDTO.Builder dto = CategoriaDTO.newBuilder();
		dto.setIdCategoria((int)u.getIdCategoria());
		dto.setNombre(u.getNombre());
		return dto;
	} // end_mapCategoriaToDTO
	
	public Categoria mapDTOToCategoria (CategoriaDTO dto) throws Exception{		
		Categoria u = new Categoria();
		u.setIdCategoria(dto.getIdCategoria());
		u.setNombre(dto.getNombre());
		return u;
	} // end_mapDTOToCategoria
    
}
