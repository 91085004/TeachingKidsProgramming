public class phoneAdver
{
  public static void main(String[] args)
  {
    String input = "1-800-NOCTURNAL-HACKS";
    System.out.println("The original String is: " + input);
    String result = convert(input);
    System.out.println("The converted String is: " + result);
  }
  public static String convert(String s)
  {
    String converted = "";
    for (int i = 0; i < s.length(); i++)
    {
      if (s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C')
      {
        converted = converted + '2';
      }
      else if (s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F')
      {
        converted = converted + '3';
      }
      else if (s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I')
      {
        converted = converted + '4';
      }
      else if (s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L')
      {
        converted = converted + '5';
      }
      else if (s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O')
      {
        converted = converted + '6';
      }
      else if (s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S')
      {
        converted = converted + '7';
      }
      else if (s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V')
      {
        converted = converted + '8';
      }
      else if (s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z')
      {
        converted = converted + '9';
      }
      else
      {
        converted = converted + s.charAt(i);
      }
    }
    //do stuff
    //do more stuff
    return converted;
  }
}
