FROM openjdk:8-jdk-alpine
ADD target/products.jar products.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","products.jar"]