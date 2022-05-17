FROM nelson9291/jdk-17:1.0.0
COPY /build/libs/front-0.0.1-SNAPSHOT.jar /front.jar
ENTRYPOINT ["java","-jar","/front.jar"]