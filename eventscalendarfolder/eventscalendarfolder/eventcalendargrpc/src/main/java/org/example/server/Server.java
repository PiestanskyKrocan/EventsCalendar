package org.example.server;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import protobuf.sdj3.CoreServicesGrpc;
import protobuf.sdj3.Event;
import protobuf.sdj3.User;

@GRpcService
public class Server extends CoreServicesGrpc.CoreServicesImplBase {

    @Override
    public void getEvent(User request, StreamObserver<Event> responseObserver) {
        super.getEvent(request, responseObserver);
        Event event = Event.newBuilder().setEventName("RockFestival").setId(1).setStartdate("22.11.2022").setEnddate("23.11.2022").build();
        responseObserver.onNext(event);
        responseObserver.onCompleted();
    }

}
