# Stage 1: compile and package the Maven application
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /workspace

# Copy the entire Maven multi-module project
COPY . .

# Select which runnable module to build
ARG MODULE=app

# Build the selected module and all Maven modules it depends on
RUN mvn -pl "${MODULE}" -am clean package -DskipTests

# Find the executable JAR and fail clearly if Maven did not produce it
RUN mkdir -p /output && \
    JAR=$(find "/workspace/${MODULE}/target" -maxdepth 1 -type f \
      -name "*.jar" ! -name "*.jar.original" | head -n 1) && \
    test -n "$JAR" && cp "$JAR" /output/app.jar

# Stage 2: run the JAR with a small Java-only image
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /output/app.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]