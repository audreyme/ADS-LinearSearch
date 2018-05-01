/*class MyThread extends Thread {

    private String to;

    public MyThread(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex
    }

    @Override
    public void run() {
        //searching algorithm
    }
}*/

import java.io.*;
import java.util.*;
import java.util.Random;
public class Runner
{
  public static void main(String[] args)
  {
    int searchNum;
    arrayLength = 100
    int[] array = new int[arrayLength];
    Scanner userInput = new Scanner(System.in);
    Random rand = new Random();
  //This is getting the user initiated search number
      System.out.println("Please enter the number between 1 - 10: ");
      searchNum = userInput.nextInt();

  //This making and filling the array to be searched

    for(int i = 0; i < arrayLength; i++)
    {
      array[i] = rand.nextInt(10) + 1;
      System.out.println(array[i]);
    }

  //This is the search algorithm that we're going to use
  for(int j = 0; j < arrayLength; j++)
  {
    if(array[i] == searchNum)
    {
      //do what you have to do to make this thing do the therng
    }
  }

  }
}
