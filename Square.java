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

/**
 *
 * @author  William Lei
 */
public class Square {
    
    public SquareType type;
    public boolean[] downCrossCheck;
    public char letter; // Special values: '.' = empty square and
                        //                 lowercase letter = blank tile
    public int row;
    public int col;
    public int minAcrossWordLength;
    Square() {
        type = SquareType.OUTSIDE;
        letter = '.';
    }
    
}
