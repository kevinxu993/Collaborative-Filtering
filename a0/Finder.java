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

import java.util.ArrayList;

/**
 * Represents the Finder, which finds some values as users want.
 */
public abstract class Finder {

  // this is a UserUserMatrix
  protected UserUserMatrix matrix;
  // this is a float representing the value wanted
  protected float goal;
  // this is a Cfiltering object
  protected Cfiltering cf;
  // this is a list of strings to be printed
  protected ArrayList<String> printList = new ArrayList<>();

  /**
   * Constructs a Finder object which contains a 2d matrix, a float, and a
   * Cfiltering object. The matrix will store float similarity scores between
   * pairs of users. The float is the value to be found. The list has all the
   * strings to be printed.
   * 
   * @param cf A Cfiltering object to be processed by the Finder object.
   */
  public Finder(Cfiltering cf) {
    // set the matrix by getting the userUserMatrix of the Cfiltering object
    matrix = new UserUserMatrix(cf.getUserUserMatrix());
    // set the goal value by getting the second score in the matrix
    goal = matrix.getElement(0, 1);
    // set the Cfiltering object in the Finder to be the Cfiltering object given
    this.cf = cf;
  }

  /**
   * Finds some values as users want.
   */
  public void find() {}

}
