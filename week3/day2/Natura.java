import java.util.Scanner;
class Natura
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the a value");
      int a=sc.nextInt();
      System.out.println("enter the b value");
      int b=sc.nextInt();
      for(int i=a;i<=b;i++)
        {
          System.out.println(i);
        }
    }
  }