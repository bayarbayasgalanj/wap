# The Number Quiz Web Application

## Overview

This project implements a Number Quiz web application as part of a lab assignment. The application presents users with a
series of number sequences and asks them to guess the next number in the sequence. The server-side logic is implemented
using Java servlets, and JSP is used to generate dynamic content and handle user interactions.

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

This lab demonstrated how to build a simple quiz application using servlets and JSP for dynamic web content. The project
reinforced the concept of separating quiz logic from presentation and showcased how JSP can be used to create
interactive web applications efficiently. The development and deployment process was straightforward and provided
hands-on experience with both Java web technologies and Docker.
