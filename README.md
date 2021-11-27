# **Running Springboot project with Docker**

## What is containerization?

    Containerization is defined as a form of operating system virtualization, through which applications are run in isolated user spaces called containers, all using the same shared operating system (OS). A container is essentially a fully packaged and portable computing environment:

## Docker

    Docker is a set of platform as a service (PaaS) products that use OS-level virtualization to deliver software in packages called containers. Containers are isolated from one another and bundle their own software, libraries and configuration files; they can communicate with each other through well-defined channels. Because all of the containers share the services of a single operating system kernel, they use fewer resources than virtual machines.

## Dockerfile

    Dockerfile is nothing but a file that contains instructions and arguments that is needed to build and run a program

## **List of basic docker commands**

1. docker –version:  
   This command is used to get the currently installed version of docker

2. docker pull:  
   Usage: docker pull <IMAGE_NAME>  
   This command is used to pull images from the docker repository docker login

3. docker run  
   Usage: docker run -it -d <IMAGE_NAME>  
   This command is used to create a container from an image

4. docker ps:  
   This command is used to list the running containers

5. docker ps -a:  
   This command is used to show all the running and exited containers

6. docker exec:
   Usage: docker exec -it <CONTAINER_ID>  
   This command is used to access the running container docker images

7. docker stop:
   Usage: docker stop <CONTAINER_ID>  
   This command stops a running container

8. docker kill:
   Usage: docker kill <CONTAINER_ID>  
   This command kills the container by stopping its execution immediately. The difference between ‘docker kill’ and ‘docker stop’ is that ‘docker stop’ gives the container time to shutdown gracefully, in situations when it is taking too much time for getting the container to stop, one can opt to kill it

9. docker commit:  
   Usage: docker commit <CONTAINER_ID> <USERNAME/IMAGE_NAME>  
   This command creates a new image of an edited container on the local system

10. docker login:  
    This command is used to login to the docker hub repository

11. docker push:  
    Usage: docker push <USERNAME/IMAGE_NAME>  
    This command is used to push an image to the docker hub repository

12. docker images:  
    This command lists all the locally stored docker images

13. docker rm:  
    Usage:  
     i. docker rm <CONTAINER_ID>  
     ii. docker rm --force <CONTAINER_ID>  
    This command is used to delete a stopped container

14. docker rmi:  
    Usage: docker rmi <IMAGE_ID>  
    This command is used to delete an image from local storage

15. docker build:  
    Usage: docker build <path to docker file>
    This command is used to build an image from a specified docker file

## **Setting up Springboot project**

    Go to https://start.spring.io/ and create a new project:

![Alt text](/screenshots/SpringInitializr.png?raw=true "Spring Initializr")

## **Versions Used:**

    * Java: 1.8
    * Maven: 3.3.9

## **Commands Used:**

1. **mvn clean package**  
   Builds the project and packages the resulting JAR file into the target directory.

2. **docker build -t devsubho/springboot-docker .**  
   This command is used to build an image from a specified docker file

3. **docker run -p 8081:8080 devsubho/springboot-docker**  
   This command is used to create a container from an image
