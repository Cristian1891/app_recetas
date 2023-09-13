import os, sys
CURRENT_DIR = os.path.dirname(os.path.abspath(__file__))
sys.path.append(os.path.dirname(CURRENT_DIR))

import proto.usuario_pb2_grpc as usuario_grpc
import proto.receta_pb2_grpc as receta_grpc
import proto.usuario_pb2 as userservice
import proto.receta_pb2 as recetaO_pb
from google.protobuf.json_format import MessageToJson
import grpc

class AppRecetasClient(object):
    def __init__(self):
        self.host = 'localhost'
        self.server_port = 9090
        self.channel = grpc.insecure_channel('{}:{}'.format(self.host, self.server_port))
        self.stub = usuario_grpc.UsuarioServiceStub(self.channel)

    def addUsuario(self, usuario):
        pUsuario = userservice.UsuarioDTO(
            idUsuario = int(usuario['idUsuario']),
            nombre = usuario['nombre'],
            apellido = usuario['apellido'],
            email = usuario['email'],
            usuario = usuario['usuario'],
            clave = usuario['clave']
        )
        return self.stub.addUsuario(pUsuario)

if __name__ == '__main__':
    cliente = AppRecetasClient()
    print("***********************")
    #result = cliente.addUsuario(usuario)
