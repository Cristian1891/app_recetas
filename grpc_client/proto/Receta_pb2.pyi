from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class RecetaDTO(_message.Message):
    __slots__ = ["idReceta", "nombre", "idUsuario", "idCategoria"]
    IDRECETA_FIELD_NUMBER: _ClassVar[int]
    NOMBRE_FIELD_NUMBER: _ClassVar[int]
    IDUSUARIO_FIELD_NUMBER: _ClassVar[int]
    IDCATEGORIA_FIELD_NUMBER: _ClassVar[int]
    idReceta: int
    nombre: str
    idUsuario: int
    idCategoria: int
    def __init__(self, idReceta: _Optional[int] = ..., nombre: _Optional[str] = ..., idUsuario: _Optional[int] = ..., idCategoria: _Optional[int] = ...) -> None: ...

class GetRecetaRequest(_message.Message):
    __slots__ = ["idReceta"]
    IDRECETA_FIELD_NUMBER: _ClassVar[int]
    idReceta: int
    def __init__(self, idReceta: _Optional[int] = ...) -> None: ...

class RecetaServerResponse(_message.Message):
    __slots__ = ["code", "msg"]
    CODE_FIELD_NUMBER: _ClassVar[int]
    MSG_FIELD_NUMBER: _ClassVar[int]
    code: int
    msg: str
    def __init__(self, code: _Optional[int] = ..., msg: _Optional[str] = ...) -> None: ...

class RecetaObjDTO(_message.Message):
    __slots__ = ["receta", "serverResponse"]
    RECETA_FIELD_NUMBER: _ClassVar[int]
    SERVERRESPONSE_FIELD_NUMBER: _ClassVar[int]
    receta: RecetaDTO
    serverResponse: RecetaServerResponse
    def __init__(self, receta: _Optional[_Union[RecetaDTO, _Mapping]] = ..., serverResponse: _Optional[_Union[RecetaServerResponse, _Mapping]] = ...) -> None: ...

class ListRecetaDTO(_message.Message):
    __slots__ = ["recetas", "serverResponse"]
    RECETAS_FIELD_NUMBER: _ClassVar[int]
    SERVERRESPONSE_FIELD_NUMBER: _ClassVar[int]
    recetas: _containers.RepeatedCompositeFieldContainer[RecetaDTO]
    serverResponse: RecetaServerResponse
    def __init__(self, recetas: _Optional[_Iterable[_Union[RecetaDTO, _Mapping]]] = ..., serverResponse: _Optional[_Union[RecetaServerResponse, _Mapping]] = ...) -> None: ...
