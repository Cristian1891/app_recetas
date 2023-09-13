from proto.receta_pb2_grpc import RecetaService, add_RecetaServiceServicer_to_server
from proto.receta_pb2 import RecetaDTO

import grpc
from concurrent import futures

class Receta(RecetaService):
    def addReceta(self, request, context):
        return request

    def GetAllRecetas(self, request, context):
        print(f"traigo todas las recetas de nombre {request.nombre}")
        return RecetaDTO(idReceta=1, nombre="kiwi", idUsuario = 1, id_categoria = 1)

def start():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    add_RecetaServiceServicer_to_server(Receta(), server)
    server.add_insecure_port('[::]:50051')
    print("server en ejecucion")
    server.start()
    server.wait_for_termination()
    pass


if __name__=="__main__":
    start()