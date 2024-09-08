package com.example.quiz;

public class Quiz {
    private static final int MAX_ATTEMPTS = 3;
    private static final int POINTS_FIRST_TRY = 10;
    private static final int POINTS_SECOND_TRY = 5;
    private static final int POINTS_THIRD_TRY = 2;
    
    private int currentQuestionIndex = 0;
    private int score = 0;
    private int attempt = 0;

    // Get the current question from SequenceDatabase
    public String getCurrentQuestion() {
        return SequenceDatabase.getSequence(currentQuestionIndex);
    }

    // Get the correct answer (if all attempts are exhausted)
    public String getCorrectAnswer() {
        if (attempt == MAX_ATTEMPTS) {
            return Integer.toString(SequenceDatabase.getAnswer(currentQuestionIndex));
        }
        return null;
    }

    // Get a hint for the current question
    public String getCurrentHint() {
        return SequenceDatabase.getHint(currentQuestionIndex);
    }

    // Check the user's answer
    public boolean checkAnswer(int userAnswer) {
        int correctAnswer = SequenceDatabase.getAnswer(currentQuestionIndex);
        
        if (userAnswer == correctAnswer) {
            // Award points based on the attempt number
            score += (attempt == 0) ? POINTS_FIRST_TRY : (attempt == 1) ? POINTS_SECOND_TRY : POINTS_THIRD_TRY;
            moveToNextQuestion();
            return true;
        }
        
        attempt++;
        
        // If the user has exhausted all attempts, move to the next question
        if (attempt >= MAX_ATTEMPTS) {
            moveToNextQuestion();
        }
        
        return false;
    }

    // Move to the next question and reset attempts
    private void moveToNextQuestion() {
        attempt = 0;
        currentQuestionIndex++;
    }

    // Check if there are more questions
    public boolean hasMoreQuestions() {
        return currentQuestionIndex < SequenceDatabase.getTotalSequences();
    }

    // Get the current score
    public int getScore() {
        return score;
    }

    // Get the current attempt number (optional, for UI feedback)
    public int getAttempt() {
        return attempt;
    }
}