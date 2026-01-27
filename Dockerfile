FROM gradle:8-jdk21 AS BUILD

WORKDIR /app

COPY . .

RUN gradle build --no-daemon

FROM amazoncorretto:21-alpine

WORKDIR /app

COPY --from=BUILD /app/build/libs/*.jar /app/notificacao.jar

EXPOSE 8083

CMD ["java", "-jar", "/app/notificacao.jar"]
