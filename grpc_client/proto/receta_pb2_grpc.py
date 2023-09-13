# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from proto import receta_pb2 as receta__pb2


class RecetaServiceStub(object):
    """Metodos para consumir 
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.addReceta = channel.unary_unary(
                '/RecetaService/addReceta',
                request_serializer=receta__pb2.RecetaDTO.SerializeToString,
                response_deserializer=receta__pb2.RecetaResponse.FromString,
                )
        self.updateReceta = channel.unary_unary(
                '/RecetaService/updateReceta',
                request_serializer=receta__pb2.RecetaDTO.SerializeToString,
                response_deserializer=receta__pb2.RecetaResponse.FromString,
                )
        self.GetRecetaByFilter = channel.unary_unary(
                '/RecetaService/GetRecetaByFilter',
                request_serializer=receta__pb2.RecetaFilterDTO.SerializeToString,
                response_deserializer=receta__pb2.ListaRecetasDTO.FromString,
                )
        self.GetAllRecetas = channel.unary_unary(
                '/RecetaService/GetAllRecetas',
                request_serializer=receta__pb2.Empty.SerializeToString,
                response_deserializer=receta__pb2.ListaRecetasDTO.FromString,
                )


class RecetaServiceServicer(object):
    """Metodos para consumir 
    """

    def addReceta(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def updateReceta(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetRecetaByFilter(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetAllRecetas(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_RecetaServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'addReceta': grpc.unary_unary_rpc_method_handler(
                    servicer.addReceta,
                    request_deserializer=receta__pb2.RecetaDTO.FromString,
                    response_serializer=receta__pb2.RecetaResponse.SerializeToString,
            ),
            'updateReceta': grpc.unary_unary_rpc_method_handler(
                    servicer.updateReceta,
                    request_deserializer=receta__pb2.RecetaDTO.FromString,
                    response_serializer=receta__pb2.RecetaResponse.SerializeToString,
            ),
            'GetRecetaByFilter': grpc.unary_unary_rpc_method_handler(
                    servicer.GetRecetaByFilter,
                    request_deserializer=receta__pb2.RecetaFilterDTO.FromString,
                    response_serializer=receta__pb2.ListaRecetasDTO.SerializeToString,
            ),
            'GetAllRecetas': grpc.unary_unary_rpc_method_handler(
                    servicer.GetAllRecetas,
                    request_deserializer=receta__pb2.Empty.FromString,
                    response_serializer=receta__pb2.ListaRecetasDTO.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'RecetaService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class RecetaService(object):
    """Metodos para consumir 
    """

    @staticmethod
    def addReceta(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/RecetaService/addReceta',
            receta__pb2.RecetaDTO.SerializeToString,
            receta__pb2.RecetaResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def updateReceta(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/RecetaService/updateReceta',
            receta__pb2.RecetaDTO.SerializeToString,
            receta__pb2.RecetaResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetRecetaByFilter(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/RecetaService/GetRecetaByFilter',
            receta__pb2.RecetaFilterDTO.SerializeToString,
            receta__pb2.ListaRecetasDTO.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetAllRecetas(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/RecetaService/GetAllRecetas',
            receta__pb2.Empty.SerializeToString,
            receta__pb2.ListaRecetasDTO.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
