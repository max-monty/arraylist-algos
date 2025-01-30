package ArrayListAlgorithms.activities;

import ArrayListAlgorithms.activities.a_ArrayListBasics.GameScoreTracker;
import ArrayListAlgorithms.activities.b_ParallelArrayLists.RecipeManager;
import ArrayListAlgorithms.activities.c_Challenge.DNASequencer;


public class Test {
    public static void main(String[] args) {
        GameScoreTracker tracker = new GameScoreTracker();
        RecipeManager manager = new RecipeManager();
        DNASequencer sequencer = new DNASequencer("ATCGATCGATCG");
    }
} 