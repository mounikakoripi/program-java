import java.util.Scanner;
class Exam
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      char ch;
      do
        {
          if(n%100==0)
          {
            System.out.println("the number is divisble by 100");
            break;
          }
          else
        {
        System.out.println("re enter the number ");
        
          int num=sc.nextInt();
        }
        }
   while(true);
    }
   }
  