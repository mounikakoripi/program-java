 //WAP to calculate sum of digits of a number.
import java.util.Scanner;
class SumOfDigit
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
      int sum=0;
      while(n>0)
        {
          int digit=n%10;
          sum=sum+digit;
           n=n/10;
        }
            System.out.println(+sum);
        }
  }