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
 * Represents the SimilarityScoreCalculator, which calculates similarity score
 * between users, whose parent class is Calculator.
 */
public class SimilarityScoreCalculator implements Calculator {

  /**
   * Determines how similar each pair of users is based on their ratings. This
   * similarity value is represented with with a float value between 0 and 1,
   * where 1 is perfect/identical similarity. Stores these values in the
   * userUserMatrix.
   * 
   * @param a A list of Objects
   */
  @Override
  public void calculate(Object[] a) {
    // this is a DistanceCalculator to calculate distance values between users
    DistanceCalculator dc = new DistanceCalculator();
    // this is a UserUserMatrixBuilder object to build the matrix
    UserUserMatrixBuilder uumb = new UserUserMatrixBuilder();
    // this is a Cfiltering object, got from the input list
    Cfiltering cf = (Cfiltering) a[0];
    // create two default floats
    float distance, similarityScore;
    // loop through all the users
    for (int i = 0; i < cf.getNumOfUsers(); i++) {
      // loop through all the users again
      for (int j = 0; j < cf.getNumOfUsers(); j++) {
        // create a UserMovieMatrix
        UserMovieMatrix umm = new UserMovieMatrix(cf.getUserMovieMatrix());
        // calculate the distance between two users
        dc.calculate(new Object[] {umm.getUserMovieMatrixRow(i),
            umm.getUserMovieMatrixRow(j)});
        // get the distance
        distance = dc.getDistance();
        // calculate the similarity score of two users
        similarityScore = 1 / (distance + 1);
        // store the similarity score in the userUserMatrix at the proper index
        uumb.build(cf, i, j, similarityScore);
      }
    }
  }

}
