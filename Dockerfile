FROM maven:3.8.5-openjdk-17
# Cloud Sql Proxy

#COPY target/shared-goal-0.0.1-SNAPSHOT.jar shared-goal-0.0.1.jar
#ENTRYPOINT ["java","-jar","/shared-goal-0.0.1.jar"]
WORKDIR /shared-goal
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run