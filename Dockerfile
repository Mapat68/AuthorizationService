FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD build/libs/AuthorizationServise-0.0.1-SNAPSHOT-plain.jar AuthorizationServise-0.0.1-SNAPSHOT-plain.jar
CMD  ["java", "-jar", "build/libs/AuthorizationServise-0.0.1-SNAPSHOT-plain.jar"]
