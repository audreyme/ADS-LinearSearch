
import java.io.*;
import java.util.*;
import java.util.Random;
import java.lang.Math;

public class MyThread extends Thread
{
  
   public static void main(String[] args)
  {
    int searchNum;
    int arrayLength = 100;
    int[] array = new int[arrayLength];
    Scanner userInput = new Scanner(System.in);
    Random rand = new Random();


  //This making and filling the array to be searched

    for(int i = 0; i < arrayLength; i++)
    {
      array[i] = rand.nextInt(10) + 1;
      System.out.print(array[i] + " ");
    }

//This is getting the user initiated search number
      System.out.println("Please enter the number between 1 - 10: ");
      searchNum = userInput.nextInt();

      MyThread t1 = new MyThread(0, (arrayLength)/2);



  }

    public MyThread(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public void run()
    {
      for(int j = startIndex; j <= endIndex; j++)
      {
        if(array[i] == searchNum)
        {
         System.out.println(searchNum + " was found at index " +i);
        }
      }
    }

 



}
