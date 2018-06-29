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

/**
 *
 * @author  William Lei
 */

// A ScrabbleMove is just an ArrayList of Squares
// plus an additional property storing the number of points
public class ScrabbleMove extends ArrayList<Square> {
    
    public int points;

    ScrabbleMove() {
        points = 0;
    }
}
