/*
 * Print the integers 1 through 100 to the console
 * They must be on 20 separate lines
 * 
 */
public class Ch008
{
  public static void main(String[] args)
  {
    for (int i = 1; i < 101; i++)
    {
      // print them all on one line
      System.out.print(i + " ");
      if (i % 5 == 0)
      {
        System.out.println();
      }
    }
  }
}
