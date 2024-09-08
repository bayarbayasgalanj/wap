# Use Tomcat as the base image
FROM tomcat:9.0-jdk11

# Copy your WAR file into the Tomcat webapps directory
COPY target/quiz-app.war /usr/local/tomcat/webapps

# Expose the default Tomcat port
EXPOSE 8080

