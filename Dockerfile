FROM openjdk:8-jdk-alpine
MAINTAINER safiraayuazizah <safiraayuazizah4safir@gmail.com>
RUN mkdir -p /app
WORKDIR /app

COPY Praktikum2.java /app

#compile file java
RUN javac Praktikum2.java

#running java
ENTRYPOINT java Praktikum2