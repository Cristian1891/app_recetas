import os, sys
CURRENT_DIR = os.path.dirname(os.path.abspath(__file__))
sys.path.append(os.path.dirname(CURRENT_DIR))

import grpc
import proto.usuario_pb2_grpc as usuario_grpc
import proto.usuario_pb2 as usuario_pb2


from google.protobuf.json_format import MessageToJson


class UsuarioClient(object):
    def __init__(self):
        self.host = 'localhost'
        self.server_port = 9090
        
        self.channel = grpc.insecure_channel('{}:{}'.format(self.host, self.server_port))
        self.stub = usuario_grpc.UsuarioServiceStub(self.channel)
        
    def addUser(self, usuario_dto):
        # request = usuario_pb2.UsuarioObjDTO(usuario)
        response = self.stub.addUsuario(usuario_dto)
        return response
    
    def getUser(self, usuario_id):
        request = usuario_pb2.GetUsuarioRequest(idUsuario=usuario_id)
        response = self.stub.getUsuario(request)
        return response
    
    def get_by_usuario_y_clave(self, usuario, clave):
        request = usuario_pb2.GetByUsuarioYClaveRequest(usuario=usuario, clave=clave)
        response = self.stub.getByUsuarioYClaveRequest(request)
        return response
    

if __name__ == '__main__':
    user = UsuarioClient()
    usuario = usuario_pb2.UsuarioDTO(
        idUsuario=4,
        nombre="Juan",
        apellido="Perez",
        email="juan@example.com",
        usuario="juan123",
        clave="clave123"
    )
    
    # Agregar un usuario
    resultado_add = user.addUser(usuario)
    print(MessageToJson(resultado_add))

    # Obtener un usuario por ID
    resultado_get = user.getUser(4)
    print(MessageToJson(resultado_get))

    # Obtener un usuario por usuario y clave
    resultado_get_by_user = user.get_by_usuario_y_clave("juan123", "clave123")
    print(MessageToJson(resultado_get_by_user))