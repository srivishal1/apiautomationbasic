FROM 4info/openjdk-as:11-jre

COPY api-service/data-sets-api.jar /opt/app/app.jar
COPY coverage/jacocoagent.jar /opt/app/agent.jar
WORKDIR /opt/app
RUN sh -c 'touch /opt/app/app.jar'

EXPOSE 8080
EXPOSE 6300


ENTRYPOINT ["java", "-javaagent:/opt/app/agent.jar=output=tcpserver,address=0.0.0.0,port=6300","-DAPP_HOME=/opt/app/","-Dspring.profiles.active=qa","-jar", "/opt/app/app.jar"]