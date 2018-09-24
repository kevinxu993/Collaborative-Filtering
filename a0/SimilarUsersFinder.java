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

import java.util.Iterator;

/**
 * Represents the SimilarUsersFinder, which finds and prints the most similar
 * pair of users in the userUserMatrix, whose parent class is Finder.
 */
public class SimilarUsersFinder extends Finder {

  /**
   * Constructs a Finder object which contains a 2d matrix, a float, and a
   * Cfiltering object. The matrix will store float similarity scores between
   * pairs of users. The float is the value to be found. The list has all the
   * strings to be printed.
   * 
   * @param cf A Cfiltering object to be processed by the Finder object.
   */
  public SimilarUsersFinder(Cfiltering cf) {
    super(cf);
  }

  /**
   * This function finds and prints the most similar pair of users in the
   * userUserMatrix.
   */
  public void find() {
    Printer.println(
        "\n\nThe most similar pairs of users from above userUserMatrix are:");
    // get the number of users
    int numOfUsers = cf.getNumOfUsers();
    // create a float to be the default largest similarity score
    float max = matrix.getElement(0, 1);
    // loop through the users
    for (int i = 0; i < numOfUsers; i++) {
      // loop through the users from the one after the current user
      // which means to loop through the upper triangle of the userUserMatrix
      for (int j = i; j < numOfUsers; j++) {
        // if two users are different
        if (i != j) {
          // select the bigger one between this score and the largest we found
          max = Math.max(matrix.getElement(i, j), max);
        }
      }
    }
    // loop through the users
    for (int i = 0; i < numOfUsers; i++) {
      // loop through the users from the one after the current user
      // which means to loop through the upper triangle of the userUserMatrix
      for (int j = i; j < numOfUsers; j++) {
        // if this score is the same as the largest, and two users are different
        if (matrix.getElement(i, j) == max && i != j) {
          // add these two users to the list
          printList.add(("User" + (i + 1) + " and User" + (j + 1)));
        }
      }
    }
    // create an Iterator of the list
    Iterator<String> Iterator = printList.iterator();
    // create an integer to count strings
    int counter = 1;
    // while there's any string left
    while ((Iterator.hasNext())) {
      // print the users with, or without a comma
      if (counter != printList.size()) {
        // print the last similarity score in this row
        Printer.print(Iterator.next());
        // print a comma to end
        Printer.println(',');
      } else {
        // print the string
        Printer.println(Iterator.next());
      }
      // increase the counter by 1
      counter++;
    }
    // print the largest similarity score
    Printer.printf("with similarity score of %.4f", max);
  }
}
