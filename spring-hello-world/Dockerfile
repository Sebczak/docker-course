FROM openjdk:17-jdk-slim AS builder

COPY . /app

WORKDIR /app

RUN ./gradlew clean build

FROM openjdk:17-jdk-alpine

COPY --from=builder /app/build/libs/spring-hello-world-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]