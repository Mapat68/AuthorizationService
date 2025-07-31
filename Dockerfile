FROM openjdk:17-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD build/libs/AuthorizationService-0.0.1-SNAPSHOT-plain.jar AuthorizationServiceApp.jar
CMD  ["java", "-jar", "AuthorizationServiceApp.jar"]
