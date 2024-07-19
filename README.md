# spring-boot-dockerize
How to Dockerize Spring Boot Application 

# Build Docker Image 
$ docker build -t my_springboot_app .

# Check Docker Image 
$ docker image ls

# Run Docker Image 
$ docker run -d -p 8081:8080 my_springboot_app

In the run command, we have specified that the port 8080 on the container should be mapped to the port 8081 on the Host OS.
