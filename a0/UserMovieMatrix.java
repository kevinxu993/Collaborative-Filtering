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
 * Represents the UserMovieMatrix, which has an int[][].
 */
public class UserMovieMatrix {
  // this is an int[][] representing the matrix
  int[][] userMovieMatrix;

  /**
   * Default Constructor.
   */
  public UserMovieMatrix() {}

  /**
   * Contructs a UserMovieMatrix with an int[][].
   * 
   * @param umm An int[][] representing a User Movie Matrix.
   */
  public UserMovieMatrix(int[][] umm) {
    userMovieMatrix = umm;
  }

  /**
   * Gets the element at the given index in the userMovieMatrix.
   * 
   * @param user An int representing the row number.
   * @param movie An int representing the column number.
   * @return the element at the given index in the userMovieMatrix.
   */
  public int getElement(int user, int movie) {
    return userMovieMatrix[user][movie];
  }

  /**
   * Sets the element at the given index in the userMovieMatrix.
   * 
   * @param user An int representing the row number.
   * @param movie An int representing the column number.
   * @param ratingValue The ratingValue to be inserted in the userMovieMatrix.
   */
  public void setElement(int user, int movie, int ratingValue) {
    userMovieMatrix[user][movie] = ratingValue;
  }

  /**
   * @return the userMovieMatrix
   */
  public int[][] getUserMovieMatrix() {
    return userMovieMatrix;
  }

  /**
   * Gets the row at the given index in the userMovieMatrix.
   * 
   * @param row An int representing the row number.
   * @return the row at the given index in the userMovieMatrix.
   */
  public int[] getUserMovieMatrixRow(int row) {
    return userMovieMatrix[row];
  }
}
