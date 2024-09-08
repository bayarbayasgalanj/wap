package com.example.quiz;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class QuizServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Quiz quiz = (Quiz) session.getAttribute("quiz");

        // Initialize the quiz if it's the first visit
        if (quiz == null) {
            quiz = new Quiz();
            session.setAttribute("quiz", quiz);
        }

        // Forward to quiz.jsp to show the first question
        request.setAttribute("question", quiz.getCurrentQuestion());
        request.setAttribute("score", quiz.getScore());
        request.getRequestDispatcher("/pages/quiz.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Quiz quiz = (Quiz) session.getAttribute("quiz");

        if (quiz == null) {
            // If the quiz session expired or is null, redirect to doGet for reinitialization
            doGet(request, response);
            return;
        }

        // Handle actions: "hint" or "submit"
        String action = request.getParameter("action");
        handleDefaultAttributes(request);  // Set default attributes (e.g., hint, error, etc.)

        if ("hint".equals(action)) {
            request.setAttribute("hint", quiz.getCurrentHint());
        } else if ("submit".equals(action)) {
            handleQuizSubmission(request, quiz);
        }

        // Check if the quiz is over
        if (!quiz.hasMoreQuestions()) {
            displayFinalResults(request, response, quiz, session);
        } else {
            // Show the next question
            request.setAttribute("question", quiz.getCurrentQuestion());
            request.setAttribute("score", quiz.getScore());
            request.getRequestDispatcher("/pages/quiz.jsp").forward(request, response);
        }
    }

    // Handle setting default attributes to avoid null pointer issues
    private void handleDefaultAttributes(HttpServletRequest request) {
        request.setAttribute("hint", null);
        request.setAttribute("correctAnswer", null);
        request.setAttribute("error", null);
    }

    // Handle the quiz answer submission logic
    private void handleQuizSubmission(HttpServletRequest request, Quiz quiz) {
        String answer = request.getParameter("answer");
        String ageStr = request.getParameter("age");

        try {
            // Validate the user's age
            int age = Integer.parseInt(ageStr);
            if (age < 4 || age > 100) {
                request.setAttribute("error", "Age must be between 4 and 100.");
            } else {
                request.setAttribute("age", age);  // Retain the user's age in the form
                // Validate and check the user's answer
                int userAnswer = Integer.parseInt(answer);
                if (!quiz.checkAnswer(userAnswer)) {
                    request.setAttribute("correctAnswer", quiz.getCorrectAnswer());
                }
            }
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Please enter a valid number for age and answer.");
        }
    }

    // Display the final results of the quiz and clear the session
    private void displayFinalResults(HttpServletRequest request, HttpServletResponse response, Quiz quiz, HttpSession session)
            throws ServletException, IOException {
        int score = quiz.getScore();
        String grade = (score >= 45) ? "A" : (score >= 35) ? "B" : (score >= 25) ? "C" : "NC";

        request.setAttribute("score", score);
        request.setAttribute("finalScore", score);
        request.setAttribute("totalQuestions", SequenceDatabase.getTotalSequences());
        request.setAttribute("grade", grade);

        // Forward to the result page and reset the quiz session
        request.getRequestDispatcher("/pages/result.jsp").forward(request, response);
        session.setAttribute("quiz", null);  // Reset quiz session after completion
    }
}