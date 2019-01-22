package com.cloud.stream.rabbit.cloudstreamrabbit.producer;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface GreetingGateway {

    @Gateway(requestChannel = ProducerChannels.DIRECT)
    void directGreetings(String msg);

    @Gateway(requestChannel = ProducerChannels.BROADCAST)
    void broadcastGreetings(String msg);

}
