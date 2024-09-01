<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Result - The Number Quiz</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 400px;
            width: 100%;
        }
        h2 {
            color: #007bff;
            margin-bottom: 20px;
        }
        p {
            font-size: 18px;
            color: #333;
            margin: 15px 0;
        }
        .score {
            font-size: 22px;
            font-weight: bold;
            color: #28a745;
            margin: 20px 0;
        }
        .retry-btn {
            display: inline-block;
            background-color: #007bff;
            color: white;
            padding: 10px 20px;
            font-size: 16px;
            border-radius: 4px;
            text-decoration: none;
            transition: background-color 0.3s ease;
        }
        .retry-btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>The Number Quiz</h2>
        <p class="score">Your final score is <strong>${finalScore}</strong> out of ${totalQuestions}.</p>
        <p>Well done! You've completed the quiz.</p>
        <a href="quiz" class="retry-btn">Try Again</a>
    </div>
</body>
</html>