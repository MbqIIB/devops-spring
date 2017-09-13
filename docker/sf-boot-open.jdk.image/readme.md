- docker build -t sf-boot-jdk.image .
- docker run -d --name sf-boot-war -p 8080:8080 sf-boot-jdk.image
- docker logs sf-boot-war
- docker exec -it sf-boot-war bash
- docker inspect sf-boot-war

- http://192.168.33.10:8080/


- docker-compose up -d
- docker-compose scale sf-boot-scale=3

- docker-compose up

- docker swarm init
- docker stack deploy --compose-file=docker-compose.yml sf-boot-scale

- docker-compose ps

- docker service ls
- docker service ps

- docker service scale sf-boot-scale_sf-boot-scale=3

- docker service ls
- docker service ps

- docker service logs
- docker service logs sf-boot-scale


