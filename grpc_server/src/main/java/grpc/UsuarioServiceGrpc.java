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
    comments = "Source: Usuario.proto")
public final class UsuarioServiceGrpc {

  private UsuarioServiceGrpc() {}

  public static final String SERVICE_NAME = "UsuarioService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.Usuario.UsuarioDTO,
      grpc.Usuario.UsuarioObjDTO> getAddUsuarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addUsuario",
      requestType = grpc.Usuario.UsuarioDTO.class,
      responseType = grpc.Usuario.UsuarioObjDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Usuario.UsuarioDTO,
      grpc.Usuario.UsuarioObjDTO> getAddUsuarioMethod() {
    io.grpc.MethodDescriptor<grpc.Usuario.UsuarioDTO, grpc.Usuario.UsuarioObjDTO> getAddUsuarioMethod;
    if ((getAddUsuarioMethod = UsuarioServiceGrpc.getAddUsuarioMethod) == null) {
      synchronized (UsuarioServiceGrpc.class) {
        if ((getAddUsuarioMethod = UsuarioServiceGrpc.getAddUsuarioMethod) == null) {
          UsuarioServiceGrpc.getAddUsuarioMethod = getAddUsuarioMethod = 
              io.grpc.MethodDescriptor.<grpc.Usuario.UsuarioDTO, grpc.Usuario.UsuarioObjDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UsuarioService", "addUsuario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Usuario.UsuarioDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Usuario.UsuarioObjDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new UsuarioServiceMethodDescriptorSupplier("addUsuario"))
                  .build();
          }
        }
     }
     return getAddUsuarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Usuario.GetUsuarioRequest,
      grpc.Usuario.UsuarioObjDTO> getGetUsuarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUsuario",
      requestType = grpc.Usuario.GetUsuarioRequest.class,
      responseType = grpc.Usuario.UsuarioObjDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Usuario.GetUsuarioRequest,
      grpc.Usuario.UsuarioObjDTO> getGetUsuarioMethod() {
    io.grpc.MethodDescriptor<grpc.Usuario.GetUsuarioRequest, grpc.Usuario.UsuarioObjDTO> getGetUsuarioMethod;
    if ((getGetUsuarioMethod = UsuarioServiceGrpc.getGetUsuarioMethod) == null) {
      synchronized (UsuarioServiceGrpc.class) {
        if ((getGetUsuarioMethod = UsuarioServiceGrpc.getGetUsuarioMethod) == null) {
          UsuarioServiceGrpc.getGetUsuarioMethod = getGetUsuarioMethod = 
              io.grpc.MethodDescriptor.<grpc.Usuario.GetUsuarioRequest, grpc.Usuario.UsuarioObjDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UsuarioService", "getUsuario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Usuario.GetUsuarioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Usuario.UsuarioObjDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new UsuarioServiceMethodDescriptorSupplier("getUsuario"))
                  .build();
          }
        }
     }
     return getGetUsuarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Usuario.GetByUsuarioYClaveRequest,
      grpc.Usuario.UsuarioObjDTO> getGetByUsuarioYClaveRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByUsuarioYClaveRequest",
      requestType = grpc.Usuario.GetByUsuarioYClaveRequest.class,
      responseType = grpc.Usuario.UsuarioObjDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Usuario.GetByUsuarioYClaveRequest,
      grpc.Usuario.UsuarioObjDTO> getGetByUsuarioYClaveRequestMethod() {
    io.grpc.MethodDescriptor<grpc.Usuario.GetByUsuarioYClaveRequest, grpc.Usuario.UsuarioObjDTO> getGetByUsuarioYClaveRequestMethod;
    if ((getGetByUsuarioYClaveRequestMethod = UsuarioServiceGrpc.getGetByUsuarioYClaveRequestMethod) == null) {
      synchronized (UsuarioServiceGrpc.class) {
        if ((getGetByUsuarioYClaveRequestMethod = UsuarioServiceGrpc.getGetByUsuarioYClaveRequestMethod) == null) {
          UsuarioServiceGrpc.getGetByUsuarioYClaveRequestMethod = getGetByUsuarioYClaveRequestMethod = 
              io.grpc.MethodDescriptor.<grpc.Usuario.GetByUsuarioYClaveRequest, grpc.Usuario.UsuarioObjDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UsuarioService", "getByUsuarioYClaveRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Usuario.GetByUsuarioYClaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Usuario.UsuarioObjDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new UsuarioServiceMethodDescriptorSupplier("getByUsuarioYClaveRequest"))
                  .build();
          }
        }
     }
     return getGetByUsuarioYClaveRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsuarioServiceStub newStub(io.grpc.Channel channel) {
    return new UsuarioServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsuarioServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UsuarioServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsuarioServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UsuarioServiceFutureStub(channel);
  }

  /**
   * <pre>
   * METODOS PARA CONSUMIR 
   * </pre>
   */
  public static abstract class UsuarioServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUsuario(grpc.Usuario.UsuarioDTO request,
        io.grpc.stub.StreamObserver<grpc.Usuario.UsuarioObjDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUsuarioMethod(), responseObserver);
    }

    /**
     */
    public void getUsuario(grpc.Usuario.GetUsuarioRequest request,
        io.grpc.stub.StreamObserver<grpc.Usuario.UsuarioObjDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUsuarioMethod(), responseObserver);
    }

    /**
     */
    public void getByUsuarioYClaveRequest(grpc.Usuario.GetByUsuarioYClaveRequest request,
        io.grpc.stub.StreamObserver<grpc.Usuario.UsuarioObjDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByUsuarioYClaveRequestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUsuarioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Usuario.UsuarioDTO,
                grpc.Usuario.UsuarioObjDTO>(
                  this, METHODID_ADD_USUARIO)))
          .addMethod(
            getGetUsuarioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Usuario.GetUsuarioRequest,
                grpc.Usuario.UsuarioObjDTO>(
                  this, METHODID_GET_USUARIO)))
          .addMethod(
            getGetByUsuarioYClaveRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Usuario.GetByUsuarioYClaveRequest,
                grpc.Usuario.UsuarioObjDTO>(
                  this, METHODID_GET_BY_USUARIO_YCLAVE_REQUEST)))
          .build();
    }
  }

  /**
   * <pre>
   * METODOS PARA CONSUMIR 
   * </pre>
   */
  public static final class UsuarioServiceStub extends io.grpc.stub.AbstractStub<UsuarioServiceStub> {
    private UsuarioServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsuarioServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsuarioServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsuarioServiceStub(channel, callOptions);
    }

    /**
     */
    public void addUsuario(grpc.Usuario.UsuarioDTO request,
        io.grpc.stub.StreamObserver<grpc.Usuario.UsuarioObjDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUsuarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsuario(grpc.Usuario.GetUsuarioRequest request,
        io.grpc.stub.StreamObserver<grpc.Usuario.UsuarioObjDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUsuarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByUsuarioYClaveRequest(grpc.Usuario.GetByUsuarioYClaveRequest request,
        io.grpc.stub.StreamObserver<grpc.Usuario.UsuarioObjDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByUsuarioYClaveRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * METODOS PARA CONSUMIR 
   * </pre>
   */
  public static final class UsuarioServiceBlockingStub extends io.grpc.stub.AbstractStub<UsuarioServiceBlockingStub> {
    private UsuarioServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsuarioServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsuarioServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsuarioServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.Usuario.UsuarioObjDTO addUsuario(grpc.Usuario.UsuarioDTO request) {
      return blockingUnaryCall(
          getChannel(), getAddUsuarioMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Usuario.UsuarioObjDTO getUsuario(grpc.Usuario.GetUsuarioRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUsuarioMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Usuario.UsuarioObjDTO getByUsuarioYClaveRequest(grpc.Usuario.GetByUsuarioYClaveRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByUsuarioYClaveRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * METODOS PARA CONSUMIR 
   * </pre>
   */
  public static final class UsuarioServiceFutureStub extends io.grpc.stub.AbstractStub<UsuarioServiceFutureStub> {
    private UsuarioServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsuarioServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsuarioServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsuarioServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Usuario.UsuarioObjDTO> addUsuario(
        grpc.Usuario.UsuarioDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUsuarioMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Usuario.UsuarioObjDTO> getUsuario(
        grpc.Usuario.GetUsuarioRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUsuarioMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Usuario.UsuarioObjDTO> getByUsuarioYClaveRequest(
        grpc.Usuario.GetByUsuarioYClaveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByUsuarioYClaveRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USUARIO = 0;
  private static final int METHODID_GET_USUARIO = 1;
  private static final int METHODID_GET_BY_USUARIO_YCLAVE_REQUEST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UsuarioServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UsuarioServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USUARIO:
          serviceImpl.addUsuario((grpc.Usuario.UsuarioDTO) request,
              (io.grpc.stub.StreamObserver<grpc.Usuario.UsuarioObjDTO>) responseObserver);
          break;
        case METHODID_GET_USUARIO:
          serviceImpl.getUsuario((grpc.Usuario.GetUsuarioRequest) request,
              (io.grpc.stub.StreamObserver<grpc.Usuario.UsuarioObjDTO>) responseObserver);
          break;
        case METHODID_GET_BY_USUARIO_YCLAVE_REQUEST:
          serviceImpl.getByUsuarioYClaveRequest((grpc.Usuario.GetByUsuarioYClaveRequest) request,
              (io.grpc.stub.StreamObserver<grpc.Usuario.UsuarioObjDTO>) responseObserver);
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

  private static abstract class UsuarioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsuarioServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Usuario.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UsuarioService");
    }
  }

  private static final class UsuarioServiceFileDescriptorSupplier
      extends UsuarioServiceBaseDescriptorSupplier {
    UsuarioServiceFileDescriptorSupplier() {}
  }

  private static final class UsuarioServiceMethodDescriptorSupplier
      extends UsuarioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UsuarioServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UsuarioServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsuarioServiceFileDescriptorSupplier())
              .addMethod(getAddUsuarioMethod())
              .addMethod(getGetUsuarioMethod())
              .addMethod(getGetByUsuarioYClaveRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
