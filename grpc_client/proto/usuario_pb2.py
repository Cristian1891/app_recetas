# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/usuario.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x13proto/usuario.proto\"p\n\nUsuarioDTO\x12\x11\n\tidUsuario\x18\x01 \x01(\x05\x12\x0e\n\x06nombre\x18\x02 \x01(\t\x12\x10\n\x08\x61pellido\x18\x03 \x01(\t\x12\r\n\x05\x65mail\x18\x04 \x01(\t\x12\x0f\n\x07usuario\x18\x05 \x01(\t\x12\r\n\x05\x63lave\x18\x06 \x01(\t\"&\n\x11GetUsuarioRequest\x12\x11\n\tidUsuario\x18\x01 \x01(\x05\";\n\x19GetByUsuarioYClaveRequest\x12\x0f\n\x07usuario\x18\x01 \x01(\t\x12\r\n\x05\x63lave\x18\x02 \x01(\t\"2\n\x15UsuarioServerResponse\x12\x0c\n\x04\x63ode\x18\x01 \x01(\x05\x12\x0b\n\x03msg\x18\x02 \x01(\t\"]\n\rUsuarioObjDTO\x12\x1c\n\x07usuario\x18\x01 \x01(\x0b\x32\x0b.UsuarioDTO\x12.\n\x0eserverResponse\x18\x02 \x01(\x0b\x32\x16.UsuarioServerResponse\"_\n\x0eListUsuarioDTO\x12\x1d\n\x08usuarios\x18\x01 \x03(\x0b\x32\x0b.UsuarioDTO\x12.\n\x0eserverResponse\x18\x02 \x01(\x0b\x32\x16.UsuarioServerResponse2\xb6\x01\n\x0eUsuarioService\x12)\n\naddUsuario\x12\x0b.UsuarioDTO\x1a\x0e.UsuarioObjDTO\x12\x30\n\ngetUsuario\x12\x12.GetUsuarioRequest\x1a\x0e.UsuarioObjDTO\x12G\n\x19getByUsuarioYClaveRequest\x12\x1a.GetByUsuarioYClaveRequest\x1a\x0e.UsuarioObjDTOb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'proto.usuario_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  _globals['_USUARIODTO']._serialized_start=23
  _globals['_USUARIODTO']._serialized_end=135
  _globals['_GETUSUARIOREQUEST']._serialized_start=137
  _globals['_GETUSUARIOREQUEST']._serialized_end=175
  _globals['_GETBYUSUARIOYCLAVEREQUEST']._serialized_start=177
  _globals['_GETBYUSUARIOYCLAVEREQUEST']._serialized_end=236
  _globals['_USUARIOSERVERRESPONSE']._serialized_start=238
  _globals['_USUARIOSERVERRESPONSE']._serialized_end=288
  _globals['_USUARIOOBJDTO']._serialized_start=290
  _globals['_USUARIOOBJDTO']._serialized_end=383
  _globals['_LISTUSUARIODTO']._serialized_start=385
  _globals['_LISTUSUARIODTO']._serialized_end=480
  _globals['_USUARIOSERVICE']._serialized_start=483
  _globals['_USUARIOSERVICE']._serialized_end=665
# @@protoc_insertion_point(module_scope)