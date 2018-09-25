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
import a0.SimilarUsersFinder;

public class SimilarUsersFinderTest {
  Cfiltering cf;
  SimilarUsersFinder suf;

  @Before
  public void setUp() throws Exception {
    cf = Cfiltering.createCfilteringWithNothing();
    suf = new SimilarUsersFinder(cf);
  }

  @Test
  public void testFind() {
    suf.find();
    float expectation = 0;
    float actualOutput;

  }

}
