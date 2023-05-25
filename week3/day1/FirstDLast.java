//WAP to find first and last digit of a number.
import java.util.Scanner;
class FirstDLast
  {
    public static void main(String []args)
    {
      int lastdigit=0;
      int firstdigit=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
      int temp=n;
      while(n>0)
        {
          firstdigit=n%10;
            n=n/10;
        }
          System.out.println("first digit is" +firstdigit);
        
      lastdigit=temp%10;
      System.out.println("last digit"+lastdigit);
    }
    
  }
