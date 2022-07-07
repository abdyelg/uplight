FROM openjdk:8
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY target/uplightapi-1.0.jar uplightapi-1.0.jar
EXPOSE 8081
CMD ["java", "-jar", "uplightapi-1.0.jar"]