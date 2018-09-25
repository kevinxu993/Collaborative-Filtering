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
package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import a0.Cfiltering;

public class CfilteringTest {

  @Test
  public void testCreateCfilteringWithNothing() {
    Cfiltering cf = Cfiltering.createCfilteringWithNothing();
    int expectation = 0;
    int actualOutput = cf.getNumOfUsers();
    assertEquals(expectation, actualOutput);
  }

  @Test
  public void testCreateCfilteringWithNumOfUsersAndMovies() {
    Cfiltering cf = Cfiltering.createCfilteringWithNumOfUsersAndMovies(1, 1);
    int expectation = 1;
    int actualOutput = cf.getNumOfUsers();
    assertEquals(expectation, actualOutput);
  }

  @Test
  public void testGetNumOfUsers() {
    Cfiltering cf = Cfiltering.createCfilteringWithNumOfUsersAndMovies(2, 1);
    int expectation = 2;
    int actualOutput = cf.getNumOfUsers();
    assertEquals(expectation, actualOutput);
  }

  @Test
  public void testGetNumOfMovies() {
    Cfiltering cf = Cfiltering.createCfilteringWithNumOfUsersAndMovies(1, 2);
    int expectation = 2;
    int actualOutput = cf.getNumOfMovies();
    assertEquals(expectation, actualOutput);
  }

  @Test
  public void testGetUserUserMatrix() {
    Cfiltering cf = Cfiltering.createCfilteringWithNothing();
    float[][] expectation = new float[1][1];
    float[][] actualOutput = cf.getUserUserMatrix();
    assertEquals(expectation, actualOutput);
  }

  @Test
  public void testGetUserMovieMatrix() {
    Cfiltering cf = Cfiltering.createCfilteringWithNothing();
    int[][] expectation = new int[1][1];
    int[][] actualOutput = cf.getUserMovieMatrix();
    assertEquals(expectation, actualOutput);
  }

}
