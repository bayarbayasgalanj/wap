# The Number Quiz Web Application

## Overview

The Number Quiz web application is designed as a lab assignment to reinforce JavaServer Pages (JSP) concepts and Model 2
web architecture. Users are presented with number sequences and must guess the next number. The application uses Java
servlets for server-side processing and JSP for dynamic content. This lab aims to solidify JSP concepts, provide
hands-on experience, and demonstrate the separation of business logic from the presentation layer.

## Features

- Display of number sequences for the quiz
- User input for guessing the next number in the sequence
- Calculation and display of the user's score
- Server-side processing using Java servlets
- Dynamic content generation using JSP
- Basic error handling for invalid inputs

## Technologies Used

- Java Servlets
- JavaServer Pages (JSP)
- HTML
- Maven (for build management)
- Docker & Apache Tomcat (for deployment)

## Project Structure

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

This lab assignment demonstrates key JSP concepts and Model 2 web architecture, including the separation of business
logic from presentation. The project offers practical experience in handling user input, validating data, and
implementing a scoring system with limited attempts.
