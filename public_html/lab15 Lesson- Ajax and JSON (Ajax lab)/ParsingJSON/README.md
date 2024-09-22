## Docker Deployment

1. Build the project:
   ```
   mvn clean package
   ```

2. Build the Docker image:
   ```
   docker-compose build
   ```

3. Run the container:
   ```
   docker-compose up
   ```

4. Access the application at `http://localhost:8080/ParsingJSON/index.jsp`

## Notes

This lab was straightforward and took about an hour to complete. It demonstrated how JSP can simplify dynamic web
content creation compared to writing all logic directly in servlets. Understanding the efficiency of JSP is beneficial
for future web development projects.

