#FROM ubuntu:latest
#LABEL authors="vaphug"
#
#ENTRYPOINT ["top", "-b"]

# Sử dụng Maven để build ứng dụng
FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Dùng JDK nhẹ để chạy ứng dụng
FROM openjdk:17-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
