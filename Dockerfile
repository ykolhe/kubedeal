# Use official OpenJDK 17 slim image
FROM eclipse-temurin:17-jdk
WORKDIR /app
# Copy the Spring Boot JAR
COPY target/kubeapp-0.0.1-SNAPSHOT.jar app.jar
# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
