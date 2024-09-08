<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Result - The Number Quiz</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 400px;
        }
        h2 {
            color: #333;
        }
        p {
            font-size: 18px;
            color: #555;
        }
        strong {
            color: #333;
        }
        .score {
            color: #4CAF50;
            font-weight: bold;
        }
        .grade {
            color: red;
            font-size: 22px;
            font-weight: bold;
        }
        .button {
            display: inline-block;
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            margin-top: 20px;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        .button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>The Number Quiz</h2>
    
    <!-- Display user's score -->
    <p>Your current score is: <span class="score">${score}</span>.</p>
    
    <!-- Display user's grade -->
    <p>Your grade is: <span class="grade">${grade}</span></p>
    
    <!-- Try Again button -->
    <a href="quiz" class="button">Try Again</a>
</div>

</body>
</html>