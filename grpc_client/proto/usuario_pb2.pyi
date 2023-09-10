from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class UsuarioDTO(_message.Message):
    __slots__ = ["idUsuario", "nombre", "apellido", "email", "usuario", "clave"]
    IDUSUARIO_FIELD_NUMBER: _ClassVar[int]
    NOMBRE_FIELD_NUMBER: _ClassVar[int]
    APELLIDO_FIELD_NUMBER: _ClassVar[int]
    EMAIL_FIELD_NUMBER: _ClassVar[int]
    USUARIO_FIELD_NUMBER: _ClassVar[int]
    CLAVE_FIELD_NUMBER: _ClassVar[int]
    idUsuario: int
    nombre: str
    apellido: str
    email: str
    usuario: str
    clave: str
    def __init__(self, idUsuario: _Optional[int] = ..., nombre: _Optional[str] = ..., apellido: _Optional[str] = ..., email: _Optional[str] = ..., usuario: _Optional[str] = ..., clave: _Optional[str] = ...) -> None: ...

class GetUsuarioRequest(_message.Message):
    __slots__ = ["idUsuario"]
    IDUSUARIO_FIELD_NUMBER: _ClassVar[int]
    idUsuario: int
    def __init__(self, idUsuario: _Optional[int] = ...) -> None: ...

class GetByUsuarioYClaveRequest(_message.Message):
    __slots__ = ["usuario", "clave"]
    USUARIO_FIELD_NUMBER: _ClassVar[int]
    CLAVE_FIELD_NUMBER: _ClassVar[int]
    usuario: str
    clave: str
    def __init__(self, usuario: _Optional[str] = ..., clave: _Optional[str] = ...) -> None: ...

class UsuarioServerResponse(_message.Message):
    __slots__ = ["code", "msg"]
    CODE_FIELD_NUMBER: _ClassVar[int]
    MSG_FIELD_NUMBER: _ClassVar[int]
    code: int
    msg: str
    def __init__(self, code: _Optional[int] = ..., msg: _Optional[str] = ...) -> None: ...

class UsuarioObjDTO(_message.Message):
    __slots__ = ["usuario", "serverResponse"]
    USUARIO_FIELD_NUMBER: _ClassVar[int]
    SERVERRESPONSE_FIELD_NUMBER: _ClassVar[int]
    usuario: UsuarioDTO
    serverResponse: UsuarioServerResponse
    def __init__(self, usuario: _Optional[_Union[UsuarioDTO, _Mapping]] = ..., serverResponse: _Optional[_Union[UsuarioServerResponse, _Mapping]] = ...) -> None: ...

class ListUsuarioDTO(_message.Message):
    __slots__ = ["usuarios", "serverResponse"]
    USUARIOS_FIELD_NUMBER: _ClassVar[int]
    SERVERRESPONSE_FIELD_NUMBER: _ClassVar[int]
    usuarios: _containers.RepeatedCompositeFieldContainer[UsuarioDTO]
    serverResponse: UsuarioServerResponse
    def __init__(self, usuarios: _Optional[_Iterable[_Union[UsuarioDTO, _Mapping]]] = ..., serverResponse: _Optional[_Union[UsuarioServerResponse, _Mapping]] = ...) -> None: ...
