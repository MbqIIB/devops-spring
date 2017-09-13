FROM tomcat:8.0-jre8
MAINTAINER docker@devops.com

ADD https://github.com/santosh32/devops-spring/blob/master/sf-boot/sf-boot-web-app/target/sf-boot-webapp.war /usr/local/tomcat/webapps/sf-boot-webapp.war

EXPOSE 8080

CMD ["catalina.sh", "run"]

# docker build -t sf-boot-tomcat.image .
# docker run -d --name sf-boot-war -p 8080:8080 sf-boot-tomcat.image
# docker logs sf-boot-war
# docker exec -it sf-boot-war bash


