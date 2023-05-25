//WAP to count the total number of digits in a number
import java.util.Scanner;
class TotalOfDigit
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
        int count=0;
      while(n>0)
        {
          int digit=n%10;
       n=n/10;
          count=count+1;
        }
      System.out.println("the number are total of digit:" +count);
    }
  }