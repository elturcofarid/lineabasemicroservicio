FROM adoptopenjdk/openjdk8:alpine-slim
EXPOSE 8080
VOLUME /tmp
ADD ./target/lineaBaseMicroservicios-0.0.1-SNAPSHOT.jar servicio.jar
ENTRYPOINT ["java","-jar","/servicio.jar"]