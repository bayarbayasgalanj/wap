<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Quiz - The Number Quiz</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f4f4f4;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #333;
            margin-bottom: 20px;
        }
        p {
            font-size: 18px;
            margin: 10px 0;
        }
        .error {
            color: red;
            margin-top: 10px;
        }
        input[type="text"] {
            width: calc(100% - 22px);
            padding: 10px;
            margin-top: 10px;
            font-size: 16px;
            border: 2px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 4px;
            cursor: pointer;
            margin-top: 20px;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        .progress {
            font-size: 14px;
            color: #777;
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>The Number Quiz</h2>
        <p>Your current score is <strong>${score}.</strong></p>
        <p>Guess the next number in the sequence:</p>
        <p><strong>${question}</strong></p>

        <c:if test="${not empty error}">
            <p class="error">${error}</p>
        </c:if>

        <form action="quiz" method="post">
            <label for="answer">Your answer:</label>
            <input type="text" id="answer" name="answer" aria-label="Answer" required>
            <input type="submit" value="Submit">
        </form>

        <!-- Corrected Progress Display -->
        <p class="progress">Question ${currentQuestionIndex + 1} of ${totalQuestions}</p>
    </div>
</body>
</html>
