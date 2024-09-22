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

4. Access the application at `http://localhost:8080/bootloader/index.jsp`