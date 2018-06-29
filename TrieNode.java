/*
 * ScrabbleProgram.java
 *
 * This code is the property of its creator William Lei.
 *
 * Purpose: I created this project for the IB English Scrabble tournament.
 *          It uses a variant of Appel and Jacobson's algorithm to create a
 *          computer program that can play scrabble. The algorithm is 
 *          simplified since it uses a trie rather than a dawg. This Java  
 *          program was translated from its original version in C++.
 *
 * References: https://pdfs.semanticscholar.org/da31/
 *                  cb24574f7c881a5dbf008e52aac7048c9d9c.pdf
 *             https://web.stanford.edu/class/cs221/2017/restricted/p-final/
 *                  cajoseph/final.pdf
 *
 *
 * Contact Email: leiw9425@gmail.com
 */

package scrabblAi;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author  William Lei
 */
public class TrieNode {
    
    public char letter;                  // Special value: "*" if root node
    public boolean isTerminalNode;       // Stores if node completes a word
    public ArrayList<TrieNode> children; // Stores the possible next letters
    
    // Stores the index of each letter of each children node
    // Ex. If a child has a letter 'C' at children [1],
    //     then letterIndexes['C'-'A'] == letterIndexes[2] == 1
    public int[] letterIndexes;

    // Constructor function
    public TrieNode() {
        children = new ArrayList<TrieNode>();
        letterIndexes = new int[26];
        Arrays.fill(letterIndexes, -1);
    }
}
