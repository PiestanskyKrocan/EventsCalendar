package protobuf.sdj3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: core.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CoreServicesGrpc {

  private CoreServicesGrpc() {}

  public static final String SERVICE_NAME = "CoreServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protobuf.sdj3.User,
      protobuf.sdj3.EventList> getGetEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvents",
      requestType = protobuf.sdj3.User.class,
      responseType = protobuf.sdj3.EventList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protobuf.sdj3.User,
      protobuf.sdj3.EventList> getGetEventsMethod() {
    io.grpc.MethodDescriptor<protobuf.sdj3.User, protobuf.sdj3.EventList> getGetEventsMethod;
    if ((getGetEventsMethod = CoreServicesGrpc.getGetEventsMethod) == null) {
      synchronized (CoreServicesGrpc.class) {
        if ((getGetEventsMethod = CoreServicesGrpc.getGetEventsMethod) == null) {
          CoreServicesGrpc.getGetEventsMethod = getGetEventsMethod =
              io.grpc.MethodDescriptor.<protobuf.sdj3.User, protobuf.sdj3.EventList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.sdj3.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.sdj3.EventList.getDefaultInstance()))
              .setSchemaDescriptor(new CoreServicesMethodDescriptorSupplier("GetEvents"))
              .build();
        }
      }
    }
    return getGetEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoreServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreServicesStub>() {
        @java.lang.Override
        public CoreServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreServicesStub(channel, callOptions);
        }
      };
    return CoreServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoreServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreServicesBlockingStub>() {
        @java.lang.Override
        public CoreServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreServicesBlockingStub(channel, callOptions);
        }
      };
    return CoreServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoreServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreServicesFutureStub>() {
        @java.lang.Override
        public CoreServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreServicesFutureStub(channel, callOptions);
        }
      };
    return CoreServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CoreServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEvents(protobuf.sdj3.User request,
        io.grpc.stub.StreamObserver<protobuf.sdj3.EventList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protobuf.sdj3.User,
                protobuf.sdj3.EventList>(
                  this, METHODID_GET_EVENTS)))
          .build();
    }
  }

  /**
   */
  public static final class CoreServicesStub extends io.grpc.stub.AbstractAsyncStub<CoreServicesStub> {
    private CoreServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreServicesStub(channel, callOptions);
    }

    /**
     */
    public void getEvents(protobuf.sdj3.User request,
        io.grpc.stub.StreamObserver<protobuf.sdj3.EventList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CoreServicesBlockingStub extends io.grpc.stub.AbstractBlockingStub<CoreServicesBlockingStub> {
    private CoreServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public protobuf.sdj3.EventList getEvents(protobuf.sdj3.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CoreServicesFutureStub extends io.grpc.stub.AbstractFutureStub<CoreServicesFutureStub> {
    private CoreServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protobuf.sdj3.EventList> getEvents(
        protobuf.sdj3.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EVENTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CoreServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CoreServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EVENTS:
          serviceImpl.getEvents((protobuf.sdj3.User) request,
              (io.grpc.stub.StreamObserver<protobuf.sdj3.EventList>) responseObserver);
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

  private static abstract class CoreServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CoreServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protobuf.sdj3.Core.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CoreServices");
    }
  }

  private static final class CoreServicesFileDescriptorSupplier
      extends CoreServicesBaseDescriptorSupplier {
    CoreServicesFileDescriptorSupplier() {}
  }

  private static final class CoreServicesMethodDescriptorSupplier
      extends CoreServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CoreServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (CoreServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CoreServicesFileDescriptorSupplier())
              .addMethod(getGetEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
