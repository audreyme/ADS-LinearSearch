import package.LinearSearch;
public class AThread extends Thread
{

  public AThread(int startIndex, int endIndex) {
    this.startIndex = startIndex;
    this.endIndex = endIndex;
  }

  public void run()
  {
    //FILL CODE FOR WHAT THREAD NEEDS TO BE DOING
    for(int j = startIndex; j <= endIndex; j++)
      {
        if(array[j] == searchNum)
        {
          System.out.println(searchNum + " was found at index " +j);
        }
      }
  }
}