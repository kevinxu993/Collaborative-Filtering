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
 * Represents the Printer, which prints stuff to the console as users want.
 */
public class Printer {

  /**
   * Prints stuff to the console, works like built-in println.
   * 
   * @param a A list of Objects.
   */
  public static void println(Object a) {
    System.out.println(a);
  }

  /**
   * Prints stuff to the console, works like built-in print.
   * 
   * @param a A list of Objects.
   */
  public static void print(Object a) {
    System.out.print(a);
  }

  /**
   * Prints stuff to the console, works like built-in printf but with 4 decimals
   * and a comma.
   * 
   * @param a A list of Objects.
   */
  public static void printfAndComma(Object a) {
    System.out.printf("%.4f, ", (float) a);
  }

  /**
   * Prints stuff to the console, works like built-in printf but with 4
   * decimals.
   * 
   * @param a A list of Objects.
   */
  public static void printf(float a) {
    System.out.printf("%.4f", a);
  }

  /**
   * Prints stuff to the console, works like built-in printf.
   * 
   * @param a A list of Objects.
   */
  public static void printf(String string, float max) {
    System.out.printf(string, max);
  }
}
