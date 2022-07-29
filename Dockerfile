FROM openjdk:11
COPY target/kotlin-rest-api:0.0.1.jar kotlin-rest-api.jar
ENTRYPOINT ["java", "-jar", "dockerdemo.jar"]