//WAP to calculate product of digits of a number
import java.util.Scanner;
class Product
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int product=1;
      System.out.println("enter the number:");
      int n=sc.nextInt();
      while(n>0)
        {
          int digit=n%10;
          n=n/10;
          product=product*digit;
        }
      System.out.println("the number is "+product);
    }
  }