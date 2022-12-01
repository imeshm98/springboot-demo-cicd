FROM openjdk:17
EXPOSE 8080
ADD target/springboot-test-project.jar springboot-test-project.jar
ENTRYPOINT ["java" ,"-jar","/springboot-test-project.jar"]