package com.example.quiz;

public class Quiz {
    private int currentQuestionIndex = 0;
    private int score = 0;

    // Get the current question from SequenceDatabase
    public String getCurrentQuestion() {
        return SequenceDatabase.getSequence(currentQuestionIndex);
    }

    // Check the user's answer
    public boolean checkAnswer(int userAnswer) {
        int correctAnswer = SequenceDatabase.getAnswer(currentQuestionIndex);
        if (userAnswer == correctAnswer) {
            score++;
            return true;
        }
        return false;
    }

    // Move to the next question
    public void nextQuestion() {
        currentQuestionIndex++;
    }

    // Check if there are more questions
    public boolean hasMoreQuestions() {
        return currentQuestionIndex < SequenceDatabase.getTotalSequences();
    }

    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }
    // Get the current score
    public int getScore() {
        return score;
    }
}
