from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class CategoriaDTO(_message.Message):
    __slots__ = ["idCategoria", "nombre"]
    IDCATEGORIA_FIELD_NUMBER: _ClassVar[int]
    NOMBRE_FIELD_NUMBER: _ClassVar[int]
    idCategoria: int
    nombre: str
    def __init__(self, idCategoria: _Optional[int] = ..., nombre: _Optional[str] = ...) -> None: ...

class GetCategoriaRequest(_message.Message):
    __slots__ = ["idCategoria"]
    IDCATEGORIA_FIELD_NUMBER: _ClassVar[int]
    idCategoria: int
    def __init__(self, idCategoria: _Optional[int] = ...) -> None: ...

class CategoriaServerResponse(_message.Message):
    __slots__ = ["code", "msg"]
    CODE_FIELD_NUMBER: _ClassVar[int]
    MSG_FIELD_NUMBER: _ClassVar[int]
    code: int
    msg: str
    def __init__(self, code: _Optional[int] = ..., msg: _Optional[str] = ...) -> None: ...

class CategoriaObjDTO(_message.Message):
    __slots__ = ["categoria", "serverResponse"]
    CATEGORIA_FIELD_NUMBER: _ClassVar[int]
    SERVERRESPONSE_FIELD_NUMBER: _ClassVar[int]
    categoria: CategoriaDTO
    serverResponse: CategoriaServerResponse
    def __init__(self, categoria: _Optional[_Union[CategoriaDTO, _Mapping]] = ..., serverResponse: _Optional[_Union[CategoriaServerResponse, _Mapping]] = ...) -> None: ...

class ListCategoriaDTO(_message.Message):
    __slots__ = ["categorias", "serverResponse"]
    CATEGORIAS_FIELD_NUMBER: _ClassVar[int]
    SERVERRESPONSE_FIELD_NUMBER: _ClassVar[int]
    categorias: _containers.RepeatedCompositeFieldContainer[CategoriaDTO]
    serverResponse: CategoriaServerResponse
    def __init__(self, categorias: _Optional[_Iterable[_Union[CategoriaDTO, _Mapping]]] = ..., serverResponse: _Optional[_Union[CategoriaServerResponse, _Mapping]] = ...) -> None: ...
