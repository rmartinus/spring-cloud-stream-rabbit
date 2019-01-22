# spring-cloud-stream-rabbit
Spring Cloud Stream with Rabbit MQ


## Running it

### Producer
```
$ ./gradlew clean build
$ docker-compose up --build
```

### Consumer
* Run two or more consumers:
```
$ git clone https://github.com/rmartinus/spring-cloud-stream-rabbit-consumer.git
$ cd spring-cloud-stream-rabbit-consumer
$ ./gradlew bootRun
```
* Go to http://localhost:8080/hello/world
* You should see the consumers logging the message, direct message in 1 of them, and broadcast in all of them
