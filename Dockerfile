FROM maven:3.5.0-jdk-8
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn validate
# ENTRYPOINT ["java","-jar","target/cloud-user.jar"]
