FROM adoptopenjdk/openjdk11:ubi
LABEL Biswadip Mukherjee<19.biswadip@gmail.com>
COPY target/spring-ms-two.jar /spring-ms-two.jar
ENV JAVA_OPTS=""
#EXPOSE 9100
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /spring-ms-two.jar" ]