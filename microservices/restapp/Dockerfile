FROM openjdk:17-slim

WORKDIR /app

COPY target/restapp-0.0.1-SNAPSHOT.jar restapp.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "restapp.jar"]