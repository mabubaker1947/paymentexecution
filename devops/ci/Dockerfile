FROM adoptopenjdk/openjdk11-openj9


USER root



ADD ./target/*.jar /opt/paymentexecution-1.0.0.jar

CMD ["java", "-Xmx200m", "-jar", "/opt/paymentexecution-1.0.0.jar"]

EXPOSE 8080

