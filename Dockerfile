FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER bold

VOLUME /tmp
ADD /target/backbase-assignment-1.0-SNAPSHOT app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
