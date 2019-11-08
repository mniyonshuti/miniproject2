FROM openjdk:8-jdk-alpine
ADD target/catalogue.jar catalogue.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","catalogue.jar"]