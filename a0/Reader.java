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

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Represents the Reader, which reads a file and build a Cfiltering object
 */
public class Reader {
  // this is a string representing the file name the user inputs
  private String fileName;
  // this is an integer representing the number of users
  private int numberOfUsers;
  // this is an integer representing the number of movies
  private int numberOfMovies;
  // this is a Cfiltering object to be built
  private Cfiltering cf;

  /**
   * This function reads user's input and a file, then builds a Cfiltering
   * object
   */
  public void read() {

    try {
      // this is a UserMovieMatrixBuilder object to build the Cfiltering object
      UserMovieMatrixBuilder ummb = new UserMovieMatrixBuilder();
      Scanner in = new Scanner(System.in);
      // print the question
      System.out.println("Enter the name of input file? ");
      // get the file name
      fileName = in.nextLine();
      FileInputStream fStream = new FileInputStream(fileName);
      BufferedReader br = new BufferedReader(new InputStreamReader(fStream));
      // get the number of users
      numberOfUsers = Integer.parseInt(br.readLine());
      // get the number of movies
      numberOfMovies = Integer.parseInt(br.readLine());
      /*
       * create a new Cfiltering object that contains: a) 2d matrix
       * i.e.userMovieMatrix (#users*#movies) b) 2d matrix i.e. userUserMatrix
       * (#users*#users)
       */
      cf = Cfiltering.createCfilteringWithNumOfUsersAndMovies(numberOfUsers,
          numberOfMovies);
      // this is a blank line being read
      br.readLine();
      // read each line of movie ratings and populate the
      // userMovieMatrix
      String row;
      // a number represents row number
      int numOfRow = 0;
      while ((row = br.readLine()) != null) {
        // allRatings is a list of all String numbers on one row
        String allRatings[] = row.split(" ");
        // a number represents column number
        int numOfCol = 0;
        for (String singleRating : allRatings) {
          // make the String number into an integer
          int rating = Integer.parseInt(singleRating);
          // populate userMovieMatrix
          ummb.build(cf, numOfRow, numOfCol, rating);
          numOfCol++;
        }
        numOfRow++;
      }
      // close the file
      fStream.close();
    } catch (FileNotFoundException e) {
      System.err.println("Do you have the input file in the root folder "
          + "of your project?");
      System.exit(0);
    } catch (IOException e) {
      System.exit(0);
    }
  }

  /**
   * @return the cf
   */
  public Cfiltering getCf() {
    return cf;
  }

}
