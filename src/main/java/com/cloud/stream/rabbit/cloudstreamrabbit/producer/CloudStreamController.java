package com.cloud.stream.rabbit.cloudstreamrabbit.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudStreamController {

    private final GreetingGateway greetingGateway;

    @Autowired
    public CloudStreamController(GreetingGateway greetingGateway) {
        this.greetingGateway = greetingGateway;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello/{name}")
    public ResponseEntity<String> hello(@PathVariable String name) {
        String message = String.format("Hello %s!", name);
        this.greetingGateway.directGreetings(String.format("Direct: %s", name));
        this.greetingGateway.broadcastGreetings(String.format("Broadcast: %s", name));
        return ResponseEntity.ok(message);
    }
}