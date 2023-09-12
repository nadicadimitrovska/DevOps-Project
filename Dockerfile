FROM openjdk:17
EXPOSE 8080
ADD target/balloon-shop-devops.jar balloon-shop-devops.jar
ENTRYPOINT ["java", "-jar", "balloon-shop-devops.jar"]



