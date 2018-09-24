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

/**
 * Represents the UserUserMatrix, which has a float[][].
 */
public class UserUserMatrix {
  // this is a float[][] representing the matrix
  float[][] userUserMatrix;

  /**
   * Default Constructor.
   */
  public UserUserMatrix() {}

  /**
   * Contructs a UserUserMatrix with a float[][].
   * 
   * @param umm An float[][] representing a User User Matrix.
   */
  public UserUserMatrix(float[][] uum) {
    userUserMatrix = uum;
  }

  /**
   * Gets the element at the given index in the userUserMatrix.
   * 
   * @param user1 An int representing the row number.
   * @param user2 An int representing the column number.
   * @return the element at the given index in the userUserMatrix.
   */
  public float getElement(int user1, int user2) {
    return userUserMatrix[user1][user2];
  }

  /**
   * Sets the element at the given index in the userUserMatrix.
   * 
   * @param user1 An int representing the row number.
   * @param user2 An int representing the column number.
   * @param similarityScore The similarityScore to be inserted in the
   *        userUserMatrix.
   */
  public void setElement(int user1, int user2, float similarityScore) {
    userUserMatrix[user1][user2] = similarityScore;
  }

  /**
   * @return the userMovieMatrix
   */
  public float[][] getUserUserMatrix() {
    return userUserMatrix;
  }

  /**
   * Gets the row at the given index in the userUserMatrix.
   * 
   * @param row An int representing the row number.
   * @return the row at the given index in the userUserMatrix.
   */
  public float[] getUserUserMatrixRow(int row) {
    return userUserMatrix[row];
  }
}
