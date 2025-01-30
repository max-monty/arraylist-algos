package ArrayListAlgorithms.activities.a_ArrayListBasics;

import java.util.ArrayList;
import java.util.Collections;


public class GameScoreTracker {
    private ArrayList<Integer> scores;
    
    public GameScoreTracker() {
        scores = new ArrayList<>();
    }
    
    public void addScore(int score) {
        if (score >= 0 && score <= 1000) {
            scores.add(score);
        }
    }
    
    public int getHighScore() {
        // TODO: Return the highest score
        // Return -1 if no scores exist
        return -1;
    }
    
    public double getAverageScore() {
        // TODO: Calculate and return the average score
        // Return -1 if no scores exist
        return -1.0;
    }
    
    public ArrayList<Integer> getTopScores(int n) {
        // TODO: Return a new ArrayList with the top n scores in descending order
        // If n is larger than list size, return all scores
        return new ArrayList<>();
    }
    
    public boolean hasImprovedPerformance() {
        // TODO: Return true if scores are in non-decreasing order
        // Return true if 0 or 1 scores exist
        return false;
    }
    
    public void removeFailedAttempts() {
        // TODO: Remove all scores below 100
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
} 