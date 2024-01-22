FROM openjdk:11


WORKDIR /app


# COPY RandomNumberGenerator-0.0.1-SNAPSHOT.jar /app/app.jar
COPY ./target/RandomNumberGenerator-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8081

# ARG JAR_FILE=./target/RandomNumberGenerator-0.0.1-SNAPSHOT.jar
# ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]