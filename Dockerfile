FROM adoptopenjdk/openjdk11:alpine

WORKDIR app

COPY . /app
COPY ./.gradle /app

RUN ./gradlew --no-daemon build

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

CMD ["java", "-jar", "./build/libs/app.jar"]