import java.util.Scanner;
class Amstrong
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
      int result,temp=n,sum=0;
      while(n>0)
        {
           int digit=n%10;
         
          result=digit*digit*digit;
          n=n/10;
         sum=sum+result;
        }
        if(temp==sum)
        {
          System.out.println("the number is amstrong number");
        }
      else{
        System.out.println("the number is not amstrong number");
      }
        
    }
  }