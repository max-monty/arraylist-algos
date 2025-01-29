import java.util.ArrayList;
import java.util.HashSet;

public class DNASequencer {
    private ArrayList<Character> sequence;
    
    public DNASequencer(String dna) {
        sequence = new ArrayList<>();
        for (char c : dna.toCharArray()) {
            sequence.add(c);
        }
    }
    
    public ArrayList<String> findRepeatingSequences(int length) {
        // TODO: Find all sequences of given length that appear more than once
        // Return empty list if length is invalid
        return new ArrayList<>();
    }
    
    public void reverseComplement() {
        // TODO: Replace sequence with its reverse complement
        // A↔T, C↔G
    }
    
    public ArrayList<Integer> findMotif(String motif) {
        // TODO: Return list of starting positions where motif appears
        // Return empty list if motif not found
        return new ArrayList<>();
    }
    
    public void removeJunk() {
        // TODO: Remove any characters that aren't A, T, C, or G
    }
    
    public void merge(DNASequencer other) {
        // TODO: Keep only subsequences that appear in both sequences
    }
    
    // Helper method for testing
    public String getSequence() {
        StringBuilder sb = new StringBuilder();
        for (char c : sequence) {
            sb.append(c);
        }
        return sb.toString();
    }
} 