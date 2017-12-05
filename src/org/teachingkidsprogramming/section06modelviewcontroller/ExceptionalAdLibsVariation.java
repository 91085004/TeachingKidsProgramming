package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibsVariation
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    String edverb = askEdverb();
    String bodyPart = askBodyPart();
  }//end of main
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Y dont you want to play? To start you need one adverb.");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("You dun goofed, dont do it again!!");
      askAdverb();
    }
    return adverb;
  }//end of method
  private static String askEdverb()
  {
    String edVerb = MessageBox.askForTextInput("Enter an -ed verb: ");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Don't like verbs? You need one now.");
      askEdverb();
    }
    else if (edVerb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are NOT adverbs, try again");
      askEdverb();
    }
    return edverb;
  }
}//end of class