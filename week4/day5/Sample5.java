import java.util.Scanner;
class Sample5
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int n=20,temp=n;
    System.out.println("enter the number:");
      for(int i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            System.out.println("the number is  prime number:");
          }
        
          else
      
            System.out.println("the number is not prime number:");
          
        }
    }
  }