FROM openjdk:8-jre-alpine
COPY target/*.jar /target/
EXPOSE 8080
CMD java -jar /target/app.jar