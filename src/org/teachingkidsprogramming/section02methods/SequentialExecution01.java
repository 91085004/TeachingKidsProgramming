package org.teachingkidsprogramming.section02methods;

public class SequentialExecution01
{
  static int counter = 1;
  //looking at sequential execution,
  //    the order operations run in a program
  public static void main(String[] args)
  {
    System.out.println("In Main #1");
    myMethod1();
    System.out.println("in Main #2");
  }//end of main method
  public static void myMethod1()
  {
    System.out.println("In my method1 #1");
    myMethod2();
  }
  public static void myMethod2()
  {
    System.out.println("In my method2 #1");
    if (counter < 10)
    {
      counter++;
      myMethod3();
    }
  }
  public static void myMethod3()
  {
    System.out.println("In my method3 #1");
    myMethod2();
  }
}//end of class
