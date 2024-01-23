FROM eclipse-temurin:19-alpine
VOLUME /tmp
EXPOSE 8080
WORKDIR /usr/app
ARG JAR_FILE=target/RandomNumberGenerator-0.0.1-SNAPSHOT.jar
RUN mkdir -p /app
ADD ${JAR_FILE} generator.jar
ENTRYPOINT ["java","-jar","generator.jar"]
# Configure logging to write to a local file in append mode
RUN ln -sf /dev/stdout /app/RandomNumberGenerator.log
