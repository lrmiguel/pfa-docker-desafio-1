# Challenge - Get Started Guide

Description: exposes via nginx an application which returns course modules from a mysql database. Limitation: no docker-compose.

#### Building the images below is optional as they are available remotely on Docker Hub.

## Create a docker network
 - docker network create desafio-1-network

## Build image and run mysql container
 - cd mysql
 - (optional) docker build -t . leormiguel/pfa-docker-desafio-1-mysql
 - docker run --rm --network desafio-1-network --name pfa-desafio-mysql -d leormiguel/pfa-docker-desafio-1-mysql

## Build image and run JAVA container
 - cd .. (Back to project root path)
 - (optional) docker build . -t leormiguel/pfa-docker-desafio-1-java (takes 1-2 minutes due to gradle's daemon startup time)
 - docker run --rm --network desafio-1-network --name pfa-desafio-java -d leormiguel/pfa-docker-desafio-1-java

## Build image and run nginx container
 - cd nginx
 - (optional) docker build . -t leormiguel/pfa-docker-desafio-1-nginx
 - docker run --rm --network desafio-1-network --name pfa-desafio-nginx -p 8080:8080 -d leormiguel/pfa-docker-desafio-1-nginx

## Test the system
 - Go to your browser and type: http://localhost:8080