# Simple Calculator Web Application

## Overview

This project implements a simple calculator web application as part of a lab assignment. The calculator performs addition and multiplication operations, with all calculations executed on the server-side using a Java servlet.

## Features

- Addition of two numbers
- Multiplication of two numbers
- Server-side calculation using Java servlets
- Basic error handling for non-numerical inputs

## Technologies Used

- Java Servlets
- HTML/CSS
- Maven (for build management)
- Docker (for deployment)
- Docker Compose (for container orchestration)

## Project Structure
simple-calculator/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── calculator/
│       │               └── CalculateServlet.java
│       └── webapp/
│           ├── index.html
│           └── WEB-INF/
│               └── web.xml
├── Dockerfile
├── docker-compose.yml
└── pom.xml
## Setup and Running Locally

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven
- A servlet container like Apache Tomcat (optional if using Docker)
- Docker
- Docker Compose

## Docker Deployment

1. Build the project:
   ```bash
   mvn clean package

2.	Build the Docker image:
   docker-compose build

3.	Run the container:
   docker-compose up

4.	Access the application at http://localhost:8080/calculator-app/   