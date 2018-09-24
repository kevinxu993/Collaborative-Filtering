// **********************************************************
// Assignment3:
// UTORID: xuxinzhe
// UT Student #: 1004050661
// Author: Xinzheng Xu
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
package a0;

import java.util.Arrays;
import java.util.Iterator;
import a0.Printer;

/**
 * Represents the UserUserMatrixPrinter, which prints a UserUserMatrix, whose
 * parent class is Builder.
 */
public class UserUserMatrixPrinter {

  /**
   * Prints out the similarity scores of the UserUserMatrix, with each row and
   * column representing each/single user and the cell position (i,j)
   * representing the similarity score between user i and user j.
   * 
   * @param cf A Cfiltering object that has the UserUserMatrix.
   */
  public void print(Cfiltering cf) {
    Printer.println("\n\nuserUserMatrix is:");
    // get the matrix from the Cfiltering object
    float[][] matrix = cf.getUserUserMatrix();
    // get the number of users
    int numOfUsers = cf.getNumOfUsers();
    // loop through the rows of UserUserMatrix
    for (int i = 0; i < numOfUsers; i++) {
      // create an int to count values
      int j = 1;
      // make the rows iterable
      Iterable<float[]> iterable = Arrays.asList(matrix[i]);
      // create an Iterator of the floats
      Iterator<float[]> matrixIterator = iterable.iterator();
      // print a [ to start a row
      Printer.print('[');
      // iterate through the columns until the last one
      while ((matrixIterator.hasNext())) {
        // print the similarity score with 4 decimal places, a , and a space
        for (float fff : matrixIterator.next()) {
          if (j % numOfUsers == 0) {
            // print the last similarity score in this row
            Printer.printf(fff);
            // print a ] to end a row
            Printer.println(']');
          } else {
            // print the value and a comma
            Printer.printfAndComma(fff);
          }
          // increase the counter by 1
          j++;
        }
      }
    }

  }
}
