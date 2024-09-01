# Beer Adviser Web Application

## Overview

This project implements a simple Beer Adviser web application as part of a lab assignment. The application allows users
to select a type of beer and receive recommendations based on their choice. The server-side logic is implemented using
Java servlets, and JSP is used to generate dynamic content.

## Features

- Selection of beer types
- Display of beer recommendations based on user input
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
beer-adviser/
├── src/
│   └── main/
│       ├── java/
│       │     └── web/
│       │          └── BeerSelect.java
│       │     └── model/
│       │          └── BeerExpert.java
│       │
│       └── resources/
│       └── webapp/
│           ├── WEB-INF/
│           │   └── web.xml
│           └── pages/
│               ├── selectBeer.jsp
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

4. Access the application at `http://localhost:8080/beer-adviser/pages/selectBeer.jsp`

## Notes

This lab was straightforward and took about an hour to complete. It demonstrated how JSP can simplify dynamic web
content creation compared to writing all logic directly in servlets. Understanding the efficiency of JSP is beneficial
for future web development projects.

