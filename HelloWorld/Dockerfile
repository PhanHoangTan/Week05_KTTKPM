# Sử dụng image Maven chính thức để build
FROM maven:3.8.4-openjdk-17 AS build

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép file pom.xml và thư mục src vào container
COPY pom.xml .
COPY src ./src

# Chạy lệnh Maven để build dự án và tạo file JAR
RUN mvn clean package

# Sử dụng image JDK chính thức để chạy ứng dụng
FROM openjdk:17-jdk-slim

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép file JAR từ giai đoạn build vào container
COPY --from=build /app/target/HelloWorld-1.0-SNAPSHOT.jar app.jar

# Đặt lệnh mặc định để chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]