FROM netflixoss/java:8

MAINTAINER Ken Schultz <schultzy51@gmail.com>

WORKDIR /data

ADD main-app/build/libs/main-app.jar /data/main-app.jar

CMD java -jar main-app.jar

