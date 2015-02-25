FROM netflixoss/java:8

MAINTAINER Ken Schultz <schultzy51@gmail.com>

WORKDIR /data

COPY build/libs/eureka-0.0.1.jar /data/eureka-0.0.1.jar

EXPOSE 8761

ENTRYPOINT java -jar /data/eureka-0.0.1.jar
