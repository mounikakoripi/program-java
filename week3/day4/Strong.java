import java.util.Scanner;
class Strong
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value:");
      int n=sc.nextInt();
     int temp=n;
      int sum=0;
    while(n>0)
        {
          int digit=n%10;
          int fact=1;
          for(int i=1;i<=digit;i++)
            {
          
            fact=fact*i;
             }
              sum=sum+fact;
              n=n/10;
            }
      
       if(sum==temp)
          {
            System.out.println("the number is strong number");
         }
            else
       {
         System.out.println("the number is not strong number");
       }
           
          }
          }
        
  
  