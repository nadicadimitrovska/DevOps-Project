FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /balloon-shop-devops
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src src
RUN mvn package -DskipTests

FROM openjdk:17
WORKDIR /balloon-shop-devops
COPY --from=build /balloon-shop-devops/target/*.jar balloon-shop-devops.jar
EXPOSE 8080
CMD ["java", "-jar", "balloon-shop-devops.jar"]
