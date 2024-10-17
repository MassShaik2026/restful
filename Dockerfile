FROM openjdk:11
EXPOSE 8080
COPY target/rest.jar rest.jar
ENTRYPOINT ["java","-jar","/rest.jar"]