FROM maven:3.9.9-eclipse-temurin-17
WORKDIR /app
COPY . .
WORKDIR /app/JavaForRender
RUN mvn clean package
CMD ["java", "-jar", "target/aritoshi-0.0.1-SNAPSHOT.jar"]