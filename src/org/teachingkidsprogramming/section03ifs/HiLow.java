package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int answer = rand.nextInt(100) + 1;
    //int answer = 40;
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!!!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
      if (i == 8)
      {
        MessageBox.showMessage("You lost");
      }
    }
  }
}
