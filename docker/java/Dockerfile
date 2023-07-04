FROM openjdk:19-alpine

ENV APP=/app
COPY . $APP
WORKDIR $APP

RUN adduser java -u 1000 -D

COPY docker/wait-for-axon.sh /wait-for-axon.sh
RUN chmod +x /wait-for-axon.sh

EXPOSE 8080

USER java
