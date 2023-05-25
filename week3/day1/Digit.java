import java.util.Scanner;
class Digit
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
      while(n>0)
        {
          int digit=n%10;
            System.out.println(+digit);
          n=n/10;
        }
       }
  }