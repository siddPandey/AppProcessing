FROM eclipse-temurin:17
LABEL mentainer="gipsidtech@gmail.com"
WORKDIR /app
COPY target/AppProcessing-0.0.1-SNAPSHOT.jar /app/AppProcessing.jar
ENTRYPOINT ["java", "-jar", "AppProcessing.jar"]
