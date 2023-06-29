FROM openjdk:19-alpine

ENV APP=/app
COPY . $APP
WORKDIR $APP

RUN adduser java -u 1000 -D

EXPOSE 8080

USER java