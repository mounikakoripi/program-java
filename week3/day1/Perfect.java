import java.util.Scanner;
class Perfect
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value:");
      int n=sc.nextInt();
      int sum=0;
      for(int i=1;i<n;i++)
        {
        if(n%i==0)
        {
          sum=sum+i;
        }
        }
        
      if(n==sum)
      {
        System.out.println("the number is perfect number:");
      }
      else{
        System.out.println("the number is not perfect number");
      }
    }
  }
  