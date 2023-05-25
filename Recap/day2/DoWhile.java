import java.util.Scanner;
class DoWhile
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      do
        {
   System.out.println("enter the starting year:");
      int sy=sc.nextInt();
      System.out.println("enter the ending year:");
      int ey=sc.nextInt();
      if(sy<=ey)
      {
      for(int i=sy;i<ey;i++)
        {
      if((i%4==0)&&(i%100!=0)||(i%400==0))
      {
       System.out.println("the year is leap year"+i);
      }
        }
      break;
      }
        
      else
      {
        System.out.println("the  start year should be less than end year: ");
      }
        }
    while(true);
    }
  }