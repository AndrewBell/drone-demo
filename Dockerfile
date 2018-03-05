FROM java:alpine
COPY ./target/drone-demo-0.0.1-SNAPSHOT.jar /usr/src/app
WORKDIR /usr/src/app
CMD ["java", "drone-demo-0.0.1-SNAPSHOT.jar"]