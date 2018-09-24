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
 * Represents the DistanceCalculator, which calculates distance between numbers,
 * whose parent class is Calculator.
 */
public class DistanceCalculator implements Calculator {
  // this is a float representing the initial distance value
  private float distance = 0;

  /**
   * Calculate the Euclidean Distance between a pair of users. This distance is
   * represented with with a float value greater or equal to 0, where 0 is
   * perfect/identical distance.
   * 
   * @param a A list of Objects.
   */
  @Override
  public void calculate(Object[] a) {
    // get a list of a user's ratings
    int[] user1 = (int[]) a[0];
    // get a list of the other user's ratings
    int[] user2 = (int[]) a[1];
    // create a default float distance
    float dis = 0;
    // loop through the ratings of two users
    for (int i = 0; i < user1.length; i++) {
      // calculate the distance between two users of one movie
      dis = dis + (float) Math.pow(user1[i] - user2[i], 2);
    }
    // calculate the total distance
    dis = (float) Math.sqrt(dis);
    // return the distance between two users
    distance = dis;
  }

  /**
   * @return the distance
   */
  public float getDistance() {
    return distance;
  }
}
