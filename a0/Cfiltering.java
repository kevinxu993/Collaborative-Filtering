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
 * Represents the Cfiltering, who has two matrices.
 */
public class Cfiltering {
  // this is a matrix containing users' movie ratings
  private UserMovieMatrix umm = new UserMovieMatrix();
  // this is a matrix containing users' similarity scores
  private UserUserMatrix uum = new UserUserMatrix();
  // this is an integer represents the number of users
  private int numOfUsers;
  // this is an integer represents the number of movies
  private int numOfMovies;

  /**
   * Default Constructor.
   */
  private Cfiltering() {
    // this is 2d matrix of size 1*1
    umm.userMovieMatrix = new int[1][1];
    // this is 2d matrix of size 1*1
    uum.userUserMatrix = new float[1][1];
  }

  /**
   * Default factory method to create Cfiltering.
   */
  public static Cfiltering createCfilteringWithNothing() {
    return new Cfiltering();
  }

  /**
   * Constructs an object which contains two 2d matrices, one of size
   * users*movies which will store integer movie ratings and one of size
   * users*users which will store float similarity scores between pairs of
   * users.
   * 
   * @param numberOfUsers Determines size of matrix variables.
   * @param numberOfMovies Determines size of matrix variables.
   */
  private Cfiltering(int numberOfUsers, int numberOfMovies) {
    // this is 2d matrix of size users*movies
    umm.userMovieMatrix = new int[numberOfUsers][numberOfMovies];
    // this is 2d matrix of size users*users
    uum.userUserMatrix = new float[numberOfUsers][numberOfUsers];
    // set the value of numOfUsers
    numOfUsers = numberOfUsers;
    // set the value of numOfMovies
    numOfMovies = numberOfMovies;
  }

  /**
   * A factory method to construct an object which contains two 2d matrices, one
   * of size users*movies which will store integer movie ratings and one of size
   * users*users which will store float similarity scores between pairs of
   * users.
   * 
   * @param numberOfUsers Determines size of matrix variables.
   * @param numberOfMovies Determines size of matrix variables.
   */
  public static Cfiltering createCfilteringWithNumOfUsersAndMovies(
      int numberOfUsers, int numberOfMovies) {
    return new Cfiltering(numberOfUsers, numberOfMovies);
  }

  /**
   * @return the numOfUsers
   */
  public int getNumOfUsers() {
    return numOfUsers;
  }

  /**
   * @return the numOfMovies
   */
  public int getNumOfMovies() {
    return numOfMovies;
  }

  /**
   * @return the userUserMatrix
   */
  public float[][] getUserUserMatrix() {
    return uum.getUserUserMatrix();
  }

  /**
   * @return the userMovieMatrix
   */
  public int[][] getUserMovieMatrix() {
    return umm.getUserMovieMatrix();
  }

}
