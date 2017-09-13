FROM tomcat:8.0-jre8
MAINTAINER docker@devops.com

ADD https://github.com/santosh32/devops-spring/blob/master/sf-boot-rest-basic/target/sf-boot-rest-basic-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/sf-boot-rest-basic.war

EXPOSE 8080

CMD ["catalina.sh", "run"]

# docker build -t sf-boot-tomcat.image .
# docker run sf-boot-tomcat.image


