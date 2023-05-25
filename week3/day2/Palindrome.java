import java.util.Scanner;
class Palindrome
  {
    public static void main(String []args)
    {
      int reverse=0;
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      int n=sc.nextInt();
      int temp=n;
      while(n>0)
        {
          int digit=n%10;
       reverse=(reverse*10)+digit;
          n=n/10;
        }
      if(temp==reverse)
      {
        System.out.println("the numbers is palindrome");
      }
      else{
        System.out.println("the number is not palindrome");
      }
    }
  }