import os, sys
CURRENT_DIR = os.path.dirname(os.path.abspath(__file__))
sys.path.append(os.path.dirname(CURRENT_DIR))


from flask import Flask, request, jsonify, make_response
from flask_cors import CORS, cross_origin
from google.protobuf.json_format import MessageToJson
from src.grpcClient import UsuarioClient

app = Flask(__name__)



@app.route('/register', methods=['POST'])
@cross_origin()
def agregar_usuario_flask():
    user = UsuarioClient()
    data = request.json  # Recibe datos del cliente en formato JSON

    resultado = user.addUser(
        nombre=data['nombre'],
        apellido=data['apellido'],
        email=data['email'],
        usuario=data['usuario'],
        clave=data['clave']
    )

    if resultado:
        usuario_response = {
            'code': resultado.serverResponse.code,
            'msg': resultado.serverResponse.msg
        }
        return MessageToJson(usuario_response)
    else:
        return MessageToJson({'error': 'Error al agregar usuario'}), 500
    
@app.route('/obtener_usuario/<int:id_usuario>', methods=['GET'])
@cross_origin()
def obtener_usuario_flask(id_usuario):
    user = UsuarioClient()
    resultado = user.getUser(id_usuario)

    if resultado:
        usuario_response = {
            'idUsuario': resultado.usuario.idUsuario,
            'nombre': resultado.usuario.nombre,
            'apellido': resultado.usuario.apellido,
            'email': resultado.usuario.email,
            'usuario': resultado.usuario.usuario,
            'clave': resultado.usuario.clave
        }
        return MessageToJson(usuario_response)
    else:
        return MessageToJson({'error': 'Error al obtener usuario por ID'}), 500

@app.route('/login', methods=['POST'])
@cross_origin()
def obtener_usuario_por_usuario_y_clave_flask():
    user = UsuarioClient()
    data = request.json  # Recibe datos del cliente en formato JSON

    resultado = user.get_by_usuario_y_clave(
        usuario=data['usuario'],
        clave=data['clave']
    )

    if resultado:
        usuario_response = {
            'idUsuario': resultado.usuario.idUsuario,
            'nombre': resultado.usuario.nombre,
            'apellido': resultado.usuario.apellido,
            'email': resultado.usuario.email,
            'usuario': resultado.usuario.usuario,
            'clave': resultado.usuario.clave
        }
        return MessageToJson(usuario_response)
    else:
        return MessageToJson({'error': 'Error al obtener usuario por usuario y clave'}), 500

