# Using lightweight jdk base image for faster build time
FROM openjdk:11-jre-slim

# Setting default working directory, moving on all comands will be automatically run inside this dir
WORKDIR /app

# Copy all files ending in  ".jar" to /app
COPY *.jar /app

#Open port 8080 for accessing the app
EXPOSE 8080

# Start up the app
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]

