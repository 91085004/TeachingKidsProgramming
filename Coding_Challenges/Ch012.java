/*
 * Print integers 1 through 100 to the console
 */
public class Ch012
{
  public static void main(String[] args)
  {
    for (int i = 1; i < 101; i++)
    {
      System.out.print(i + " ");
      if (i % 50 == 0)
      {
        System.out.println();
      }
    }
  }
}
