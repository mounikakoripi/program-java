import java.util.Scanner;
class Fact
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value:");
      int n=sc.nextInt();
      int fact=1;
      for(int i=1;i<=n;i++)
        {
         
            fact=fact*i;
            System.out.println("the factorial number is:"+fact);
          }
        }
      
    }
  