# Activity 1: Game Score Analyzer

## Overview
You'll be building a score analysis system for an arcade game where players compete in multiple rounds. The system will track scores and provide various statistics and filtering operations.

## Background
Each score represents points earned in a single round. Valid scores range from 0 to 1000. The system needs to analyze these scores in different ways to provide insights about player performance.

## Your Tasks
Implement the following methods in GameScoreTracker.java:

1. `getHighScore()`: Find the highest score achieved
2. `getAverageScore()`: Calculate the average score across all rounds
3. `getTopScores(int n)`: Return a new ArrayList with the top n scores
4. `hasImprovedPerformance()`: Check if each score is >= the previous score
5. `removeFailedAttempts()`: Remove all scores below 100 points

## Testing Your Code
Test your implementation with:
- Empty list of scores
- Single score
- Multiple scores including duplicates
- Scores in different orders
- Edge cases (0, 1000)

## Tips
- Consider using Collections.sort() for the top scores method
- Remember to handle edge cases
- Think about efficiency in your solutions 