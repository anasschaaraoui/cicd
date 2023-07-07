FROM openjdk:17
EXPOSE 8080
COPY build/libs/cicd.jar /app/cicd.jar
ENTRYPOINT ["java", "-jar", "/app/cicd.jar"]
