# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: receta.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0creceta.proto\"V\n\tRecetaDTO\x12\x10\n\x08idReceta\x18\x01 \x01(\x05\x12\x0e\n\x06nombre\x18\x02 \x01(\t\x12\x11\n\tidUsuario\x18\x03 \x01(\x05\x12\x14\n\x0cid_categoria\x18\x04 \x01(\x05\"\x07\n\x05\x45mpty\"w\n\x0fRecetaFilterDTO\x12\x10\n\x08idReceta\x18\x01 \x01(\x05\x12\x11\n\tcategoria\x18\x02 \x01(\x05\x12\x0e\n\x06titulo\x18\x03 \x01(\t\x12\x14\n\x0cingredientes\x18\x04 \x01(\t\x12\x19\n\x11tiempoPreparacion\x18\x05 \x01(\t\"1\n\x14RecetaServerResponse\x12\x0c\n\x04\x63ode\x18\x01 \x01(\x05\x12\x0b\n\x03msg\x18\x02 \x01(\t\"[\n\x0eRecetaResponse\x12\x1a\n\x06receta\x18\x01 \x01(\x0b\x32\n.RecetaDTO\x12-\n\x0eserverResponse\x18\x02 \x01(\x0b\x32\x15.RecetaServerResponse\"]\n\x0fListaRecetasDTO\x12\x1b\n\x07recetas\x18\x01 \x03(\x0b\x32\n.RecetaDTO\x12-\n\x0eserverResponse\x18\x02 \x01(\x0b\x32\x15.RecetaServerResponse2\xca\x01\n\rRecetaService\x12(\n\taddReceta\x12\n.RecetaDTO\x1a\x0f.RecetaResponse\x12+\n\x0cupdateReceta\x12\n.RecetaDTO\x1a\x0f.RecetaResponse\x12\x37\n\x11GetRecetaByFilter\x12\x10.RecetaFilterDTO\x1a\x10.ListaRecetasDTO\x12)\n\rGetAllRecetas\x12\x06.Empty\x1a\x10.ListaRecetasDTOb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'receta_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  _globals['_RECETADTO']._serialized_start=16
  _globals['_RECETADTO']._serialized_end=102
  _globals['_EMPTY']._serialized_start=104
  _globals['_EMPTY']._serialized_end=111
  _globals['_RECETAFILTERDTO']._serialized_start=113
  _globals['_RECETAFILTERDTO']._serialized_end=232
  _globals['_RECETASERVERRESPONSE']._serialized_start=234
  _globals['_RECETASERVERRESPONSE']._serialized_end=283
  _globals['_RECETARESPONSE']._serialized_start=285
  _globals['_RECETARESPONSE']._serialized_end=376
  _globals['_LISTARECETASDTO']._serialized_start=378
  _globals['_LISTARECETASDTO']._serialized_end=471
  _globals['_RECETASERVICE']._serialized_start=474
  _globals['_RECETASERVICE']._serialized_end=676
# @@protoc_insertion_point(module_scope)
