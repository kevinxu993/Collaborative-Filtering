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
 * Represents the UserMovieMatrixBuilder, which builds a UserMovieMatrix, whose
 * parent class is Builder.
 */
public class UserMovieMatrixBuilder extends Builder {

  /**
   * The purpose of this method is to populate the UserMovieMatrix. As input
   * parameters it takes in a rowNumber, columnNumber and a rating value. The
   * rating value is then inserted in the UserMovieMatrix at the specified
   * rowNumber and the columnNumber.
   * 
   * @param cf The Cfiltering object that has the UserMovieMatrix.
   * @param rowNumber The row number of the UserMovieMatrix.
   * @param columnNumber The column number of the UserMovieMatrix.
   * @param ratingValue The ratingValue to be inserted in the UserMovieMatrix.
   */
  public void build(Cfiltering cf, int rowNumber, int columnNumber,
      int ratingValue) {
    // get the matrix from the Cfiltering object
    UserMovieMatrix matrix = new UserMovieMatrix(cf.getUserMovieMatrix());
    // store a rating in the userMovieMatrix at a proper index.
    matrix.setElement(rowNumber, columnNumber, ratingValue);
  }

}
