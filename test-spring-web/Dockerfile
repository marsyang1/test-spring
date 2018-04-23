# FROM frolvlad/alpine-oraclejdk8:slim
FROM openjdk:8
VOLUME /tmp
ADD build/libs/test-spring-web-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -XX:+UseG1GC -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]