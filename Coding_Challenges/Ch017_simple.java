/*
 * 1) Ask the user how many rows they’d like to print, N (where N stands for Number of rows)
 * 2) Print the integers 1 through 100 to the console. They must be on N separate lines.
 * 3) Make sure the user doesn’t enter a value that is less than 1 or more than 100 (in other words, 
 * validate user input)
 * 4) Do not let the user enter any number of rows that is not a factor of 100
 *    i.e. only allow the following numbers: 1, 2, 4, 5, 10, 20, 25, 50, 100 * 
 * 
 */
import java.util.Scanner;

public class Ch017_simple
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("How many rows to print?: ");
    String strRows = scan.next();
    //System.out.println("you entered " + strRows + " rows.");
    // convert strRows to an actual int data type. Use Java's Integer class
    int rows = Integer.parseInt(strRows);
    // input validation
    if (rows <= 0 || rows > 100 || (100 % rows != 0)) // don't allow negative numbers or division by zero exceptions
    {
      System.out.println("Please enter a factor of 100!");
      System.exit(0);
    }
    // if we get here, we know rows is >= 1 and rows <= 100
    // input validation
    //    if (100 % rows != 0) // if 100 mod rows is not equal to zero
    //    {
    //      System.out.println("Please enter a factor of 100!");
    //      System.exit(0);
    //    }
    int perLine = 100 / rows;
    int rowCounter = 1;
    System.out.print("Row " + rowCounter + ": ");
    for (int i = 1; i < 101; i++)
    {
      System.out.print(i + " ");
      if (i % perLine == 0) // if i is divisible by perLine make a new line
      {
        System.out.println();
        rowCounter++;
        if (rowCounter <= rows)
        {
          System.out.print("Row " + rowCounter + ": ");
        }
      }
    }
  }
}
