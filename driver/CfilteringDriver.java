// **********************************************************
// Assignment3:
// UTORID:
// UT Student #:
// Author:
//
//
// Honor Code: I pledge that this program represents my own
// program code and that I have coded on my own. I received
// help from no one in designing and debugging my program.
// I have also read the plagiarism section in the course info
// sheet of CSC B07 and understand the consequences. In this semester
// we will select any three of your assignments from total of 5 and run it
// for plagiarism check.
// *********************************************************
package driver;

import java.io.FileNotFoundException;
import java.io.IOException;
import a0.*;

/**
 * Represents the CfilteringDriver, which drives all the related classes.
 */
public class CfilteringDriver {

  /**
   * Reads user movie ratings from a text file, calculates similarity scores and
   * prints a score matrix.
   */
  public static void main(String[] args)
      throws FileNotFoundException, IOException {
    // create a Reader to read user's inputs and a file
    Reader r = new Reader();
    // read user's inputs and a file
    r.read();
    // get the Cfiltering object
    Cfiltering cfObject = r.getCf();
    // create a SimilarityScoreCalculator to CALCULATE THE SIMILARITY SCORE
    // BETWEEN USERS.
    SimilarityScoreCalculator ssc = new SimilarityScoreCalculator();
    // CALCULATE THE SIMILARITY SCORE BETWEEN USERS.
    ssc.calculate(new Object[] {cfObject});
    // PRINT OUT THE userUserMatrix
    UserUserMatrixPrinter uump = new UserUserMatrixPrinter();
    uump.print(cfObject);
    // PRINT OUT THE MOST SIMILAR PAIRS OF USER AND THE MOST DISSIMILAR PAIR
    // OF USERS.
    SimilarUsersFinder suf = new SimilarUsersFinder(cfObject);
    suf.find();
    DissimilarUsersFinder duf = new DissimilarUsersFinder(cfObject);
    duf.find();
  }

}
