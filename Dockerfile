FROM openjdk:8-jdk-alpine

COPY api-service/greetingservice-0.0.1-SNAPSHOT.jar /opt/app/app.jar
COPY coverage/jacocoagent.jar /opt/app/agent.jar
WORKDIR /opt/app
RUN sh -c 'touch /opt/app/app.jar'

EXPOSE 8080



ENTRYPOINT ["java", "-javaagent:/opt/app/agent.jar=output=tcpserver,address=0.0.0.0,port=6300","-DAPP_HOME=/opt/app/","-jar", "/opt/app/app.jar"]