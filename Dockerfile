FROM azul/zulu-openjdk:17-latest
COPY demo/build/libs/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [java -jar, "/app.jar"]
EXPOSE 8080