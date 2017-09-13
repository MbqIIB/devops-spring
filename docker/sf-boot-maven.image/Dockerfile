FROM maven:3.5-jdk-8-alpine
MAINTAINER docker@devops.com

WORKDIR sf-boot-maven-app

ADD ./sf-boot-mysql-sf-data-jpa-hibernate/ ${WORKDIR}

RUN ["mvn", "package"]

EXPOSE 8080

CMD ["mvn", "spring-boot:run"]

# docker build -t sf-boot-maven.image .
# docker run sf-boot-maven.image