FROM openjdk:8-jre-alpine
ARG JAR_FILE=target/travel-broker-1.0-jar-with-dependencies.jar
ENV SERVICE_HOST localhost
ENV SERVICE_PORT 9000
RUN mkdir -p /usr/share/travelbroker/
ADD ${JAR_FILE} /usr/share/travelbroker/travelbroker.jar
RUN ls /usr/share/travelbroker/
WORKDIR /user/share/travelbroker
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/travelbroker/travelbroker.jar"]
