//import java.util.Scanner;
class Prime extends Thread
  {
    public void run()
    {
      for(int i=1;i<=100;i++)
        {
      int count=0;
      for(int j=1;j<=i;j++){
      if(i%j==0)
            count++;
           }
      if(count==2)
      {
        System.out.println(i);
      }
        }
    }
  }
class PrimeMulti 
{
  public static void main(String []args)
  {
    Prime t=new Prime();
    t.start();
    for(int i=0;i<=100;i++)
      {
        if(i%2==0)
        {
          System.out.println("the number is even numbers:" +i);
        }
      }
  }
}