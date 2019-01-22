FROM openjdk:11-slim
MAINTAINER rmartinus
RUN mkdir -p /opt/producer
WORKDIR /opt/producer
COPY build/libs/cloud-stream-rabbit-0.0.1-SNAPSHOT.jar /opt/producer/cloud-stream-rabbit-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-Dspring.profiles.active=docker", "-jar","/opt/producer/cloud-stream-rabbit-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
