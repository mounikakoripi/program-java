import java.util.Scanner;
class Power
  {
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the power value");
      int power=sc.nextInt();
      System.out.println("enter the base value");
      int n=sc.nextInt();
      int result=1;
      for(int i=1;i<=power;i++)
        {
          
          result=result*n;//3//9
    }
         System.out.println(result);
        
    }
  }