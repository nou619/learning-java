FROM openjdk:17
WORKDIR /app
COPY . .
RUN javac src/project1.java
CMD ["java", "-cp", "src", "project1"]
