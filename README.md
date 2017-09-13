Build and Run Docker Container using Dockerfile
--
- Goto devops-spring/docker/sf-boot-open.jdk.image/ path and run below commands 
  
  - docker build -t sf-boot-jdk.image .
  - docker run -d --name sf-boot-war -p 8080:8080 sf-boot-jdk.image
  - docker logs sf-boot-war
  - docker exec -it sf-boot-war bash
  - docker inspect sf-boot-war

Access Spring boot application
--
- http://192.168.33.10:8080/


Build and Run Docker Container using Docker compose
--
- docker-compose up -d
- docker-compose scale sf-boot-scale=3


TODO: Docker swarm
--
- docker swarm init
- docker stack deploy --compose-file=docker-compose.yml sf-boot-scale

TODO: Other Docker Operations
--
- docker-compose ps

- docker service ls
- docker service ps

- docker service scale sf-boot-scale_sf-boot-scale=3

- docker service ls
- docker service ps

- docker service logs
- docker service logs sf-boot-scale


