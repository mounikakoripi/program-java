import java. util.Scanner;
class PrimeArr
  {
    public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
      int arr[]=new int[5];
      System.out.println("enter the array elements:");
      int count=0;
      for(int i=0;i<5;i++)
        {
          arr[i]=sc.nextInt();
        }
      int i;
      for(int j=1;j<i;j++)  
        {
        if(i%j==0)
        {
          count++;
        }
        }
      if(count==2)
      {
        System.out.println("the number is prime number:"+i);
      }
      else
      {
        System.out.println("the number is not prime number:"+i);
      }
    }  
  }
  
  