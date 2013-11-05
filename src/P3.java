/** 
 * Assignment 3             P3.java         Due August 17, 2013
 * login #: cs11vau
 */

import java.util.*; // Scanner

public class P3 {
  public static void main(String[] args) {
    char choice; // Repeat program
    String str = ""; // Input sentence
    String inputStr; // Repeat input
    Scanner scan = new Scanner(System.in); // Read input from keyboard
    do {
      System.out.print("Enter your words to (case insensitive) sort: ");
      inputStr = scan.nextLine(); // Read message

      ascendSortStr(inputStr); // Ascending sorted words

      descendSortStr(inputStr); // Descending sorted words

      System.out.print("\nWant more sorting (y/n)? ");
      str = scan.next(); // Read and assign to String
      choice = str.charAt(0); // Assign to character
      if (scan.hasNextLine()) // <ENTER> character
        str = scan.nextLine(); // Read line, discard
    } while (choice != 'n' && choice != 'N'); // Repeat until n or N input

    scan.close(); // Close this scanner
    System.exit(0);
  }

  public static void ascendSortStr(String words) { // Bubble sort words
    String tmpStrg = "";
    String[] a = words.split(" +"); // Array String delimit mult space
    String[] orig = words.split(" +"); // Original array

    System.out.print("Ascending sort order:  ");
    for (int i = 0; i < orig.length; i++) { // Bubble sort in ascending order
      for (int j = i + 1; j < orig.length; j++) {
        if (orig[j].compareToIgnoreCase(orig[i]) < 0) {
          tmpStrg = orig[i];
          orig[i] = orig[j];
          orig[j] = tmpStrg;
        }
      }
      System.out.print(orig[i] + " ");  // Print one element at a time w/ loop
    }
    System.out.print("\n");

  } // Display original words

  public static void descendSortStr(String words) {
    /** Bubble sort words in descending order */
    String tmpStrg = "";
    String[] a = words.split(" +"); // Array String delimit mult space
    String[] orig = words.split(" +"); // Original array

    System.out.print("Descending sort order: ");
    for (int i = 0; i < orig.length; i++) { // Bubble sort in ascending order
      for (int j = i + 1; j < orig.length; j++) {
        if (orig[j].compareToIgnoreCase(orig[i]) > 0) {
          tmpStrg = orig[i];
          orig[i] = orig[j];
          orig[j] = tmpStrg;
        }
      }
      System.out.print(orig[i] + " "); // Print one element at a time w/ loop
    }
    System.out.print("\n");
  }

}