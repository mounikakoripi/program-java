import java.util.Scanner;
class Examp
  {
    public static void main(final String []args)
    {
      final Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
       int n=sc.nextInt();
      if(n%100==0)
      {
        System.out.println("the number divisible by 100");
      }
     else
      {
     System.out.println("invalid amount");
      }
     
    }
  }