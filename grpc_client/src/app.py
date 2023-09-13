import os, sys
CURRENT_DIR = os.path.dirname(os.path.abspath(__file__))
sys.path.append(os.path.dirname(CURRENT_DIR))

from flask import Flask, request, jsonify, make_response
from flask_cors import CORS, cross_origin
from google.protobuf.json_format import MessageToJson
from src.grpcClient import AppRecetasClient

app = Flask(__name__)

@app.route("/")
def hello():
    return "Hola Mundo!"

@app.route("/prueba", methods=["POST"])
@cross_origin()
def createUser():
    print("Alta de usuario")
    cliente = AppRecetasClient()
    result = cliente.addUsuario(request.json)
    print("Alta de usuario realizada")
    return make_response("ok")