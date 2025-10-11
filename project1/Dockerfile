FROM openjdk:17
WORKDIR /app
COPY . .
RUN javac src/project-one/project1.java
CMD ["java", "-cp", "src/project-one", "project1"]
