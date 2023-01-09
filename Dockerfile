FROM FROM openjdk:17-jdk-alpine

RUN mkdir -p /usr/src/app

COPY *.jar /usr/src/app

EXPOSE 8080

WORKDIR /usr/src/app
CMD ["/bin/sh", "-c", "find -type f -name '*.jar' | xargs java ${JAVA_OPTS} -jar"]
