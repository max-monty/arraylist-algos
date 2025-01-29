# Activity 3: DNA Sequence Analyzer

## Overview
Create a DNA sequence analysis tool that performs various operations on genetic sequences using ArrayList operations.

## Background
DNA sequences are represented as strings of A, T, C, and G nucleotides. The analyzer will help scientists study DNA by implementing various sequence manipulation and analysis operations.

## Your Tasks
Implement the following operations in DNASequencer.java:

1. `findRepeatingSequences(int length)`: Find all repeating subsequences of given length
2. `reverseComplement()`: Create complement sequence and reverse it (A↔T, C↔G)
3. `findMotif(String motif)`: Find all starting positions of a given motif
4. `removeJunk()`: Remove any characters that aren't A, T, C, or G
5. `merge(DNASequencer other)`: Combine sequences, keeping only shared subsequences

## Tips
- Start with simpler operations first
- Test with small sequences
- Consider using StringBuilder for string operations
- Think about efficiency with longer sequences

## Example
Input sequence: "ATCGATCGAT"
- Repeating sequences of length 3: ["ATC", "TCG", "CGA"]
- Reverse complement: "ATCGATCGAT" → "ATCGATCGAT"
- Positions of motif "AT": [0, 4, 8] 