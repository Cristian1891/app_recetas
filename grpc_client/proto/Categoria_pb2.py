# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/Categoria.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x15proto/Categoria.proto\"3\n\x0c\x43\x61tegoriaDTO\x12\x13\n\x0bidCategoria\x18\x01 \x01(\x05\x12\x0e\n\x06nombre\x18\x02 \x01(\t\"*\n\x13GetCategoriaRequest\x12\x13\n\x0bidCategoria\x18\x01 \x01(\x05\"4\n\x17\x43\x61tegoriaServerResponse\x12\x0c\n\x04\x63ode\x18\x01 \x01(\x05\x12\x0b\n\x03msg\x18\x02 \x01(\t\"e\n\x0f\x43\x61tegoriaObjDTO\x12 \n\tcategoria\x18\x01 \x01(\x0b\x32\r.CategoriaDTO\x12\x30\n\x0eserverResponse\x18\x02 \x01(\x0b\x32\x18.CategoriaServerResponse\"g\n\x10ListCategoriaDTO\x12!\n\ncategorias\x18\x01 \x03(\x0b\x32\r.CategoriaDTO\x12\x30\n\x0eserverResponse\x18\x02 \x01(\x0b\x32\x18.CategoriaServerResponse2{\n\x10\x43\x61tegoriaService\x12/\n\x0c\x61\x64\x64\x43\x61tegoria\x12\r.CategoriaDTO\x1a\x10.CategoriaObjDTO\x12\x36\n\x0cgetCategoria\x12\x14.GetCategoriaRequest\x1a\x10.CategoriaObjDTOb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'proto.Categoria_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  _globals['_CATEGORIADTO']._serialized_start=25
  _globals['_CATEGORIADTO']._serialized_end=76
  _globals['_GETCATEGORIAREQUEST']._serialized_start=78
  _globals['_GETCATEGORIAREQUEST']._serialized_end=120
  _globals['_CATEGORIASERVERRESPONSE']._serialized_start=122
  _globals['_CATEGORIASERVERRESPONSE']._serialized_end=174
  _globals['_CATEGORIAOBJDTO']._serialized_start=176
  _globals['_CATEGORIAOBJDTO']._serialized_end=277
  _globals['_LISTCATEGORIADTO']._serialized_start=279
  _globals['_LISTCATEGORIADTO']._serialized_end=382
  _globals['_CATEGORIASERVICE']._serialized_start=384
  _globals['_CATEGORIASERVICE']._serialized_end=507
# @@protoc_insertion_point(module_scope)
