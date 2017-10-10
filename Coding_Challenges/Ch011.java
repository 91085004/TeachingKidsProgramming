/*
 * Print the integers 1 through 100 to the console
 * They must be on 50 separate lines
 */
public class Ch011
{
  public static void main(String[] args)
  {
    for (int i = 1; i < 101; i += 2)
    {
      if (i % 2 == 0)
      {
        System.out.println(i + " ");
      }
      // for (int j = i; j < i + 2; j++)
      // {
      //i = 1 --> j = 1, 2
      //          System.out.print(j + " ");
      // }
      //  System.out.println();
      // }
    }
  }
}
