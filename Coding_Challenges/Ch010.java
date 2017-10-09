/*
 * Print the integers 1 through 100 to the console.
 * They must be on 4 seperate lines
 */
public class Ch010
{
  public static void main(String[] args)
  {
    for (int i = 1; i < 101; i++)
    {
      System.out.print(i + " ");
      if (i % 25 == 0)
      {
        System.out.println();
      }
    }
  }
}
