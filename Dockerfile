FROM openjdk:8
COPY ./target/kt_springboot-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=DOCKER", "-jar", "app.jar"]