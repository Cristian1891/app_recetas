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
    comments = "Source: Receta.proto")
public final class RecetaServiceGrpc {

  private RecetaServiceGrpc() {}

  public static final String SERVICE_NAME = "RecetaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.Receta.RecetaDTO,
      grpc.Receta.RecetaObjDTO> getAddRecetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addReceta",
      requestType = grpc.Receta.RecetaDTO.class,
      responseType = grpc.Receta.RecetaObjDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Receta.RecetaDTO,
      grpc.Receta.RecetaObjDTO> getAddRecetaMethod() {
    io.grpc.MethodDescriptor<grpc.Receta.RecetaDTO, grpc.Receta.RecetaObjDTO> getAddRecetaMethod;
    if ((getAddRecetaMethod = RecetaServiceGrpc.getAddRecetaMethod) == null) {
      synchronized (RecetaServiceGrpc.class) {
        if ((getAddRecetaMethod = RecetaServiceGrpc.getAddRecetaMethod) == null) {
          RecetaServiceGrpc.getAddRecetaMethod = getAddRecetaMethod = 
              io.grpc.MethodDescriptor.<grpc.Receta.RecetaDTO, grpc.Receta.RecetaObjDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RecetaService", "addReceta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Receta.RecetaDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Receta.RecetaObjDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new RecetaServiceMethodDescriptorSupplier("addReceta"))
                  .build();
          }
        }
     }
     return getAddRecetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Receta.GetRecetaRequest,
      grpc.Receta.RecetaObjDTO> getGetRecetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getReceta",
      requestType = grpc.Receta.GetRecetaRequest.class,
      responseType = grpc.Receta.RecetaObjDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Receta.GetRecetaRequest,
      grpc.Receta.RecetaObjDTO> getGetRecetaMethod() {
    io.grpc.MethodDescriptor<grpc.Receta.GetRecetaRequest, grpc.Receta.RecetaObjDTO> getGetRecetaMethod;
    if ((getGetRecetaMethod = RecetaServiceGrpc.getGetRecetaMethod) == null) {
      synchronized (RecetaServiceGrpc.class) {
        if ((getGetRecetaMethod = RecetaServiceGrpc.getGetRecetaMethod) == null) {
          RecetaServiceGrpc.getGetRecetaMethod = getGetRecetaMethod = 
              io.grpc.MethodDescriptor.<grpc.Receta.GetRecetaRequest, grpc.Receta.RecetaObjDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RecetaService", "getReceta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Receta.GetRecetaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Receta.RecetaObjDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new RecetaServiceMethodDescriptorSupplier("getReceta"))
                  .build();
          }
        }
     }
     return getGetRecetaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecetaServiceStub newStub(io.grpc.Channel channel) {
    return new RecetaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecetaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RecetaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecetaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RecetaServiceFutureStub(channel);
  }

  /**
   * <pre>
   * METODOS PARA CONSUMIR 
   * </pre>
   */
  public static abstract class RecetaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addReceta(grpc.Receta.RecetaDTO request,
        io.grpc.stub.StreamObserver<grpc.Receta.RecetaObjDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRecetaMethod(), responseObserver);
    }

    /**
     */
    public void getReceta(grpc.Receta.GetRecetaRequest request,
        io.grpc.stub.StreamObserver<grpc.Receta.RecetaObjDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRecetaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddRecetaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Receta.RecetaDTO,
                grpc.Receta.RecetaObjDTO>(
                  this, METHODID_ADD_RECETA)))
          .addMethod(
            getGetRecetaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Receta.GetRecetaRequest,
                grpc.Receta.RecetaObjDTO>(
                  this, METHODID_GET_RECETA)))
          .build();
    }
  }

  /**
   * <pre>
   * METODOS PARA CONSUMIR 
   * </pre>
   */
  public static final class RecetaServiceStub extends io.grpc.stub.AbstractStub<RecetaServiceStub> {
    private RecetaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecetaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecetaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecetaServiceStub(channel, callOptions);
    }

    /**
     */
    public void addReceta(grpc.Receta.RecetaDTO request,
        io.grpc.stub.StreamObserver<grpc.Receta.RecetaObjDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRecetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReceta(grpc.Receta.GetRecetaRequest request,
        io.grpc.stub.StreamObserver<grpc.Receta.RecetaObjDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRecetaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * METODOS PARA CONSUMIR 
   * </pre>
   */
  public static final class RecetaServiceBlockingStub extends io.grpc.stub.AbstractStub<RecetaServiceBlockingStub> {
    private RecetaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecetaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecetaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecetaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.Receta.RecetaObjDTO addReceta(grpc.Receta.RecetaDTO request) {
      return blockingUnaryCall(
          getChannel(), getAddRecetaMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Receta.RecetaObjDTO getReceta(grpc.Receta.GetRecetaRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRecetaMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * METODOS PARA CONSUMIR 
   * </pre>
   */
  public static final class RecetaServiceFutureStub extends io.grpc.stub.AbstractStub<RecetaServiceFutureStub> {
    private RecetaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecetaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecetaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecetaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Receta.RecetaObjDTO> addReceta(
        grpc.Receta.RecetaDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRecetaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Receta.RecetaObjDTO> getReceta(
        grpc.Receta.GetRecetaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRecetaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_RECETA = 0;
  private static final int METHODID_GET_RECETA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecetaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecetaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_RECETA:
          serviceImpl.addReceta((grpc.Receta.RecetaDTO) request,
              (io.grpc.stub.StreamObserver<grpc.Receta.RecetaObjDTO>) responseObserver);
          break;
        case METHODID_GET_RECETA:
          serviceImpl.getReceta((grpc.Receta.GetRecetaRequest) request,
              (io.grpc.stub.StreamObserver<grpc.Receta.RecetaObjDTO>) responseObserver);
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

  private static abstract class RecetaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecetaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Receta.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecetaService");
    }
  }

  private static final class RecetaServiceFileDescriptorSupplier
      extends RecetaServiceBaseDescriptorSupplier {
    RecetaServiceFileDescriptorSupplier() {}
  }

  private static final class RecetaServiceMethodDescriptorSupplier
      extends RecetaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecetaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RecetaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecetaServiceFileDescriptorSupplier())
              .addMethod(getAddRecetaMethod())
              .addMethod(getGetRecetaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
