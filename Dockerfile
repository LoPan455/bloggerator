FROM openjdk:11-jdk
WORKDIR /app
COPY build/libs/bloggerator-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]