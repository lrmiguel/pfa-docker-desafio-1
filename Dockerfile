FROM adoptopenjdk/openjdk11:alpine

WORKDIR app

COPY . /app
COPY ./.gradle /app

RUN ./gradlew --no-daemon build
RUN apk add --no-cache openssl

ENV DOCKERIZE_VERSION v0.6.1
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && rm dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

ENTRYPOINT ["dockerize", "-wait", "tcp://pfa-desafio-mysql:3306"]
CMD ["java", "-jar", "./build/libs/app.jar"]