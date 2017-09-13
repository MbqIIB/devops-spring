FROM openjdk:8-jdk-alpine
MAINTAINER docker@devops.com

WORKDIR /spring-boot-app

# replace below url with nexus or artifacts repository to get full blown integration.
ADD https://github.com/santosh32/devops-spring/blob/master/sf-boot/sf-boot-web-app/target/sf-boot-web-app.war ${WORKDIR}

EXPOSE 8080

CMD ["java -jar sf-boot-web-app.war"]

# docker build -t sf-boot-jdk.image .
# docker run -d --name sf-boot-war -p 8080:8080 sf-boot-jdk.image
# docker logs sf-boot-war
# docker exec -it sf-boot-war bash
# docker inspect sf-boot-war


