package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * METODOS PARA CONSUMIR 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Categoria.proto")
public final class CategoriaServiceGrpc {

  private CategoriaServiceGrpc() {}

  public static final String SERVICE_NAME = "CategoriaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.Categoria.CategoriaDTO,
      grpc.Categoria.CategoriaObjDTO> getAddCategoriaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCategoria",
      requestType = grpc.Categoria.CategoriaDTO.class,
      responseType = grpc.Categoria.CategoriaObjDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Categoria.CategoriaDTO,
      grpc.Categoria.CategoriaObjDTO> getAddCategoriaMethod() {
    io.grpc.MethodDescriptor<grpc.Categoria.CategoriaDTO, grpc.Categoria.CategoriaObjDTO> getAddCategoriaMethod;
    if ((getAddCategoriaMethod = CategoriaServiceGrpc.getAddCategoriaMethod) == null) {
      synchronized (CategoriaServiceGrpc.class) {
        if ((getAddCategoriaMethod = CategoriaServiceGrpc.getAddCategoriaMethod) == null) {
          CategoriaServiceGrpc.getAddCategoriaMethod = getAddCategoriaMethod = 
              io.grpc.MethodDescriptor.<grpc.Categoria.CategoriaDTO, grpc.Categoria.CategoriaObjDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CategoriaService", "addCategoria"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Categoria.CategoriaDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Categoria.CategoriaObjDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new CategoriaServiceMethodDescriptorSupplier("addCategoria"))
                  .build();
          }
        }
     }
     return getAddCategoriaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Categoria.GetCategoriaRequest,
      grpc.Categoria.CategoriaObjDTO> getGetCategoriaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCategoria",
      requestType = grpc.Categoria.GetCategoriaRequest.class,
      responseType = grpc.Categoria.CategoriaObjDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Categoria.GetCategoriaRequest,
      grpc.Categoria.CategoriaObjDTO> getGetCategoriaMethod() {
    io.grpc.MethodDescriptor<grpc.Categoria.GetCategoriaRequest, grpc.Categoria.CategoriaObjDTO> getGetCategoriaMethod;
    if ((getGetCategoriaMethod = CategoriaServiceGrpc.getGetCategoriaMethod) == null) {
      synchronized (CategoriaServiceGrpc.class) {
        if ((getGetCategoriaMethod = CategoriaServiceGrpc.getGetCategoriaMethod) == null) {
          CategoriaServiceGrpc.getGetCategoriaMethod = getGetCategoriaMethod = 
              io.grpc.MethodDescriptor.<grpc.Categoria.GetCategoriaRequest, grpc.Categoria.CategoriaObjDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CategoriaService", "getCategoria"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Categoria.GetCategoriaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Categoria.CategoriaObjDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new CategoriaServiceMethodDescriptorSupplier("getCategoria"))
                  .build();
          }
        }
     }
     return getGetCategoriaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CategoriaServiceStub newStub(io.grpc.Channel channel) {
    return new CategoriaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CategoriaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CategoriaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CategoriaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CategoriaServiceFutureStub(channel);
  }

  /**
   * <pre>
   * METODOS PARA CONSUMIR 
   * </pre>
   */
  public static abstract class CategoriaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addCategoria(grpc.Categoria.CategoriaDTO request,
        io.grpc.stub.StreamObserver<grpc.Categoria.CategoriaObjDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCategoriaMethod(), responseObserver);
    }

    /**
     */
    public void getCategoria(grpc.Categoria.GetCategoriaRequest request,
        io.grpc.stub.StreamObserver<grpc.Categoria.CategoriaObjDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCategoriaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddCategoriaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Categoria.CategoriaDTO,
                grpc.Categoria.CategoriaObjDTO>(
                  this, METHODID_ADD_CATEGORIA)))
          .addMethod(
            getGetCategoriaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Categoria.GetCategoriaRequest,
                grpc.Categoria.CategoriaObjDTO>(
                  this, METHODID_GET_CATEGORIA)))
          .build();
    }
  }

  /**
   * <pre>
   * METODOS PARA CONSUMIR 
   * </pre>
   */
  public static final class CategoriaServiceStub extends io.grpc.stub.AbstractStub<CategoriaServiceStub> {
    private CategoriaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CategoriaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoriaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CategoriaServiceStub(channel, callOptions);
    }

    /**
     */
    public void addCategoria(grpc.Categoria.CategoriaDTO request,
        io.grpc.stub.StreamObserver<grpc.Categoria.CategoriaObjDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCategoriaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCategoria(grpc.Categoria.GetCategoriaRequest request,
        io.grpc.stub.StreamObserver<grpc.Categoria.CategoriaObjDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCategoriaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * METODOS PARA CONSUMIR 
   * </pre>
   */
  public static final class CategoriaServiceBlockingStub extends io.grpc.stub.AbstractStub<CategoriaServiceBlockingStub> {
    private CategoriaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CategoriaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoriaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CategoriaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.Categoria.CategoriaObjDTO addCategoria(grpc.Categoria.CategoriaDTO request) {
      return blockingUnaryCall(
          getChannel(), getAddCategoriaMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Categoria.CategoriaObjDTO getCategoria(grpc.Categoria.GetCategoriaRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCategoriaMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * METODOS PARA CONSUMIR 
   * </pre>
   */
  public static final class CategoriaServiceFutureStub extends io.grpc.stub.AbstractStub<CategoriaServiceFutureStub> {
    private CategoriaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CategoriaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoriaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CategoriaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Categoria.CategoriaObjDTO> addCategoria(
        grpc.Categoria.CategoriaDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCategoriaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Categoria.CategoriaObjDTO> getCategoria(
        grpc.Categoria.GetCategoriaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCategoriaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CATEGORIA = 0;
  private static final int METHODID_GET_CATEGORIA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CategoriaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CategoriaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CATEGORIA:
          serviceImpl.addCategoria((grpc.Categoria.CategoriaDTO) request,
              (io.grpc.stub.StreamObserver<grpc.Categoria.CategoriaObjDTO>) responseObserver);
          break;
        case METHODID_GET_CATEGORIA:
          serviceImpl.getCategoria((grpc.Categoria.GetCategoriaRequest) request,
              (io.grpc.stub.StreamObserver<grpc.Categoria.CategoriaObjDTO>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CategoriaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CategoriaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Categoria.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CategoriaService");
    }
  }

  private static final class CategoriaServiceFileDescriptorSupplier
      extends CategoriaServiceBaseDescriptorSupplier {
    CategoriaServiceFileDescriptorSupplier() {}
  }

  private static final class CategoriaServiceMethodDescriptorSupplier
      extends CategoriaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CategoriaServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CategoriaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CategoriaServiceFileDescriptorSupplier())
              .addMethod(getAddCategoriaMethod())
              .addMethod(getGetCategoriaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
