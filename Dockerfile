FROM openjdk:17
COPY ./target/lab2-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/
EXPOSE 8858
ENTRYPOINT ["java", "-jar", "./app/lab2-0.0.1-SNAPSHOT.jar"]