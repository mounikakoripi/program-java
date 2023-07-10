import java.util.Scanner;
class Example
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
      int reverse=0;
       int  temp=n;
      while(n>0)
        {
          int digit=n%10;
            reverse=(reverse*10)+digit;
            n=n/10;
          
        }
      if(temp==reverse)
      {
        System.out.println("the number is palindrome:");
      }
      else{
        System.out.println("the number is not palindrome:");
      }
    }
  }