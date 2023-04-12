FROM openjdk:18.0.1.1
WORKDIR /app
ADD target/backend-0.0.1-SNAPSHOT.jar backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","backend-0.0.1-SNAPSHOT.jar"]
