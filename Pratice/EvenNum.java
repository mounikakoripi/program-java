import java.util.Scanner;
class EvenNum
  {
    public static void main(String []args)
    {
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    int n=sc.nextInt();
      int array[]=new int[];
      for(int i=0;i<=n;i++)
        {
          if(i%2==0)
          {
            
            System.out.println("the even numbers is:"+i);
          }
        }
    }
  }