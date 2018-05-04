//Audrey Meadows
import java.util.Scanner;
import java.io.*;
import java.util.Random;
import java.lang.Math;

class AThread extends Thread
{
  int startIndex;
  int endIndex;
  int searchNum;
  int [] array;

  AThread(int startIndex, int endIndex, int search, int [] arr)
  {
    System.out.println("Start index: " + startIndex +"   End Index: " + endIndex);
    startIndex = startIndex;
    endIndex = endIndex;
    searchNum = search;
    array = arr;
  }

  public void run()
  {
    System.out.println("did this work");
    System.out.println("Start index: " + startIndex +"   End Index: " + endIndex);
    //FILL CODE FOR WHAT THREAD NEEDS TO BE DOING
    for(int j = startIndex; j < endIndex; j++)
      {
        if(array[j] == searchNum)
        {
          System.out.println(searchNum + " was found at index " +j);
        }
      }
  }
}

public class LinearSearch
{
  public static void main(String args[])
  {
    int searchNum;
    int arrayLength = 100;
    int[] array = new int[arrayLength];
    Scanner userInput = new Scanner(System.in);
    Random rand = new Random();

  //This making, filling, and printing out the array to be searched

    for(int i = 0; i < arrayLength; i++)
    {
      array[i] = rand.nextInt(10) + 1;
      System.out.print(array[i] + " ");
    }

  //This is getting the user initiated search number
    System.out.println("Please enter the number between 1 - 10: ");
    searchNum = userInput.nextInt();

  //CREATE IN SUCH A WAY THAT IT CAN LOOK AT DIFFERENT SECTIONS
  //aka TAKE PARAMS
    AThread t1 = new AThread(0, 49, searchNum, array);
    AThread t2 = new AThread(50, 99, searchNum, array);
    t1.start();
    t2.start();
  }
}

