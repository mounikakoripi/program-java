import java.util.Scanner;
class Odd1
  {
    public static void main(String []args)
    {
      int i=1;
      do
        {
          if(i%2==0)
          {
            i++;
            continue;
            
          }
          System.out.println("list the odd numbers\n" +i);
          i++;
        }while(i<=100);
      System.exit(0);
     }
    
  }
  