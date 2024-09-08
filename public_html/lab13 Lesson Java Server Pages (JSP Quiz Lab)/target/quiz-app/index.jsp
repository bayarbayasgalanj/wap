<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome - The Number Quiz</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            color: #333;
            text-align: center;
            padding: 50px;
            margin: 0;
        }

        .container {
            background-color: #fff;
            padding: 40px;
            border-radius: 12px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            margin: 0 auto;
        }

        h1 {
            color: #007bff;
            font-size: 36px;
            margin-bottom: 20px;
        }

        p {
            font-size: 18px;
            color: #555;
            margin-bottom: 30px;
        }

        .button {
            display: inline-block;
            margin: 10px;
            padding: 15px 30px;
            font-size: 18px;
            color: #fff;
            background-color: #007bff;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            cursor: pointer;
            transition: background-color 0.3s ease, transform 0.2s ease;
        }

        .button:hover {
            background-color: #0056b3;
            transform: translateY(-3px);
        }

        @media (max-width: 600px) {
            body {
                padding: 20px;
            }

            h1 {
                font-size: 28px;
            }

            p {
                font-size: 16px;
            }

            .container {
                padding: 30px;
            }

            .button {
                font-size: 16px;
                padding: 12px 25px;
            }
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Welcome to The Number Quiz</h1>
    <p>Test your knowledge with our fun and challenging quiz!</p>

    <!-- Link to start the quiz -->
    <a href="quiz" class="button">Start Quiz</a>

    <!-- Optional: Add other links or information here -->
    <!-- <a href="about.jsp" class="button">About</a> -->
</div>
</body>
</html>