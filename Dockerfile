FROM nelson9291/apline-openjdk17:latest
COPY /build/libs/front-0.0.1-SNAPSHOT.jar /front.jar
ENTRYPOINT ["java","-jar","/front.jar"]