package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise go as fast as possible --#6
    Tortoise.setSpeed(10);
    //    Change the width of the line the tortoise draws to 1 pixel --#12
    Tortoise.setPenWidth(1);
    //    Change the Tortoise to a Spider --#14
    Tortoise.setAnimal(Animals.Spider);
    //    Change the pen color of the line the tortoise draws to red --#13.1
    Tortoise.setPenColor(Reds.Red);
    //    Set the color of the background window to black (HINT: use the Tortoise to get the background window) --#13.2
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    //    The current length of a line is 10.5 pixels --#1.2       
    double length = 10.5;
    //    The current zoom is 1.1 --#8.2
    double zoom = 1.1;
    //    Do the following 10 times --#10.1
    for (int i = 0; i < 10; i++)
    {
      //        weaveOneLayer (recipe below) --#9.1
      //
      //        ------------- Recipe for weaveOneLayer --#9.2
      //        Do the following 6 times --#5.1
      for (int j = 0; j < 6; j++)
      {
        //            drawTriangle (recipe below) --#4.1
        //
        //            ------------- Recipe for drawTriangle --#4.2
        //            Do the following 3 times --#3.1
        for (int j2 = 0; j2 < 3; j2++)
        {
          //                Move the tortoise the current length (of the line) --#1.1
          Tortoise.move(length);
          //                Turn the tortoise 1/3rd of 360 degrees --#2
          Tortoise.turn(360 / 3);
          //            End Repeat --#3.2
        }
        //            ------------- End of drawTriangle recipe --#4.3
        //
        //            Turn the tortoise 1/6th of 360 degrees to the right --#7
        Tortoise.turn(360 / 6);
        //            Increase the current length (of the line) by the current zoom --#8.1
        length = length * zoom;
        //        End Repeat --#5.2
      }
      //        ------------- End of weaveOneLayer recipe --#9.3
      //
      //        Change the current zoom so it is multiplied by 1.3 --#11
      zoom = zoom * 1.3;
      //    End Repeat --#10.2
    }
  }
}
