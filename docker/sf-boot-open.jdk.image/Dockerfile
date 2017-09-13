FROM java:8
MAINTAINER docker@devops.com

# replace below url with nexus or artifactory repository to get full blown integration.
ADD https://raw.githubusercontent.com/santosh32/devops-spring/master/sf-boot/sf-boot-web-app/target/sf-boot-web-app.war sf-boot-web-app.war

EXPOSE 8080

CMD ["java", "-jar", "sf-boot-web-app.war"]



