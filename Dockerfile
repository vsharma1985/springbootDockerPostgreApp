FROM openjdk:17
EXPOSE 8080
ADD target/springboot-pgdb-k8s.jar springboot-pgdb-k8s.jar
ENTRYPOINT ["java","-jar","/springboot-pgdb-k8s.jar"]