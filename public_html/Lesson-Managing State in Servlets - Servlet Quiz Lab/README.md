<!-- Number Quiz Web Application -->
<!-- Overview -->
This project is a Number Quiz web application developed as part of a lab assignment. The application challenges users to predict the next number in a given sequence. The server-side logic is powered by Java servlets, while JSP handles the dynamic generation of content and user interactions.

<!-- Features -->
Interactive quiz with number sequences
User input for guessing the next number
Real-time score calculation and display
Robust server-side processing with Java servlets
Dynamic page rendering using JSP
Error handling for invalid inputs
<!-- Technologies Used -->
Java Servlets
JavaServer Pages (JSP)
HTML
Maven (build management)
Docker & Apache Tomcat (deployment)
<!-- Project Structure -->

```
number-quiz/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── quiz/
│       │               ├── Quiz.java
│       │               ├── QuizServlet.java
│       │               └── QuizException.java
│       └── resources/
│       └── webapp/
|           ├── index.jsp
|           ├── error.jsp
│           ├── WEB-INF/
│           │   ├── web.xml
│           └── pages/
│               ├── quiz.jsp
│               └── result.jsp
├── pom.xml
└── README.md
```

## Setup and Running Locally

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven
- A servlet container like Apache Tomcat (optional if using Docker)
- Docker
- Docker Compose

### Running Locally

1. **Build the project**:
   ```
   mvn clean package
   ```

2. **Deploy the application**:
    - If using Tomcat, deploy the WAR file found in the `target` directory to your Tomcat server.
    - If using Docker, follow the Docker deployment steps below.

## Docker Deployment

1. **Build the Docker image**:
   ```
   docker-compose build
   ```

2. **Run the container**:
   ```
   docker-compose up
   ```

3. **Access the application** at `http://localhost:8080/quiz-app/quiz`

## Notes
This project was developed to showcase the importance of separating business logic from presentation layers. By isolating the core quiz logic, the functionality can easily be adapted for different interfaces, such as a console application or a web application.

