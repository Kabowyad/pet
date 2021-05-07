FROM openjdk:11-jre-slim
ENV APP_FILE restaurant-service-0.0.1-SNAPSHOT.jar
ENV APP_HOME restaurant-service
EXPOSE 8080
COPY /build/libs/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]
