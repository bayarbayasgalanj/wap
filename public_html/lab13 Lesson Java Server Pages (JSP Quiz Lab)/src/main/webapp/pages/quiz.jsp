<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Quiz - The Number Quiz</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            max-width: 600px;
            margin: 20px auto;
            padding: 20px;
            background-color: #f9f9f9;
            border: 1px solid #ccc;
            border-radius: 8px;
        }
        h2 {
            text-align: center;
        }
        .section {
            margin-bottom: 20px;
        }
        .error {
            color: red;
        }
        .hint {
            color: blue;
        }
        .button {
            display: block;
            width: 100%;
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            border-radius: 4px;
            cursor: pointer;
        }
        .button:hover {
            background-color: #45a049;
        }
        .result {
            color: red;
            font-weight: bold;
            text-align: center;
        }
    </style>
</head>
<body>

<h2>The Number Quiz</h2>

<!-- Display user's score -->
<div class="section">
    <p>Your current score is <strong>${score}</strong>.</p>
</div>

<!-- Quiz form -->
<div class="section">
    <form action="quiz" method="post">
        <input type="hidden" name="action" value="submit">
        
        <!-- Display the current question -->
        <p>Question: ${question}</p>

        <!-- Answer input -->
        <p>Your answer:
            <input type="text" name="answer" required>
        </p>

        <!-- Age input with validation feedback -->
        <label for="age">Your Age:</label>
        <input type="text" id="age" name="age" value="${age != null ? age : ''}">
        <c:if test="${error != null}">
            <p class="error">${error}</p>
        </c:if>

        <input type="submit" value="Submit" class="button">
    </form>
</div>

<!-- Hint button and display -->
<div class="section">
    <form action="quiz" method="post">
        <input type="hidden" name="action" value="hint">

        <!-- Display hint if available -->
        <c:if test="${hint != null}">
            <p class="hint">Hint: ${hint}</p>
        </c:if>

        <!-- Display correct answer if user has failed after 3 attempts -->
        <c:if test="${correctAnswer != null}">
            <p class="result">Correct Answer: ${correctAnswer}</p>
        </c:if>

        <!-- Disable hint button if hint is already shown -->
        <button type="submit" class="button" <c:if test="${hint != null}">disabled</c:if>>Hint</button>
    </form>
</div>

</body>
</html>