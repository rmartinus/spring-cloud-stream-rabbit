package com.cloud.stream.rabbit.cloudstreamrabbit;

import com.cloud.stream.rabbit.cloudstreamrabbit.producer.ProducerChannels;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.IntegrationComponentScan;

@SpringBootApplication
@EnableBinding(ProducerChannels.class)
@IntegrationComponentScan
public class CloudStreamRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudStreamRabbitApplication.class, args);
	}

}

