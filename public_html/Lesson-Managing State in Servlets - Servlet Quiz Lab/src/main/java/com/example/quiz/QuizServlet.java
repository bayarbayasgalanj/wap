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

        if (quiz == null) {
            quiz = new Quiz();
            session.setAttribute("quiz", quiz);
        }

        if (!quiz.hasMoreQuestions()) {
            request.setAttribute("score", quiz.getScore());
            request.setAttribute("finalScore", quiz.getScore());
            request.setAttribute("totalQuestions", SequenceDatabase.getTotalSequences());
            request.getRequestDispatcher("/pages/result.jsp").forward(request, response);
            session.setAttribute("quiz", null);
        } else {
            request.setAttribute("question", quiz.getCurrentQuestion());
            request.setAttribute("score", quiz.getScore());
            request.setAttribute("currentQuestionIndex", quiz.getCurrentQuestionIndex());
            request.setAttribute("totalQuestions", SequenceDatabase.getTotalSequences());
            request.getRequestDispatcher("/pages/quiz.jsp").forward(request, response);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Quiz quiz = (Quiz) session.getAttribute("quiz");

        if (quiz != null) {
            String answer = request.getParameter("answer");
            try {
                int userAnswer = Integer.parseInt(answer);
                if (!quiz.checkAnswer(userAnswer)) {
                    request.setAttribute("error", "Incorrect! Please try again.");
                }
                quiz.nextQuestion();
            } catch (NumberFormatException e) {
                request.setAttribute("error", "Please enter a valid number.");
            }
        }

        response.sendRedirect("quiz");
    }

}
