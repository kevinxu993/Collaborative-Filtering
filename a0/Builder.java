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
 * Represents the Builder, which builds matrices.
 */
public abstract class Builder {

  /**
   * The purpose of this method is to populate a matrix. As input parameters it
   * takes in a rowNumber, columnNumber and a rating value. The rating value is
   * then inserted in the matrix at the specified rowNumber and the
   * columnNumber.
   * 
   * @param rowNumber The row number of the matrix.
   * @param columnNumber The column number of the matrix.
   * @param ratingValue The ratingValue to be inserted in the matrix
   */
  public void build(Cfiltering cf, int rowNumber, int columnNumber,
      int ratingValue) {}

}
