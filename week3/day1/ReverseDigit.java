import java.util.Scanner;
class ReverseDigit
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
      int reverse=0;
      while(n>0)
        {
          int digit=n%10;
          reverse=(reverse*10)+digit;
          n=n/10;
        }
      System.out.println(" the reverse digit is"+reverse);
    }
  }