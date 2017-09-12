FROM maven:3.5-jdk-8-alpine
MAINTAINER docker@devops.com

WORKDIR sf-boot-rest-basic-app

ADD https://github.com/santosh32/devops-spring/blob/master/sf-boot-rest-basic/target/sf-boot-rest-basic-1.0-SNAPSHOT.war ${WORKDIR}

EXPOSE 8080

CMD ["mvn", "spring-boot:run"]

# docker build -t sf-boot-rest-basic-app .

# docker run sf-boot-rest-basic-app