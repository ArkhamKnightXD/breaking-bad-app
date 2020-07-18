FROM openjdk:8

ADD build/libs/bad-0.0.1-SNAPSHOT.jar bad-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","bad-0.0.1-SNAPSHOT.jar"]