import java.util.Scanner;
public  class ExceptionHandling{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the a value");
      try{
      int a=sc.nextInt();
      int c=sc.nextInt();
      int sum=a/c;
      System.out.println(sum);
      }
      catch(ArithmeticException e){
      System.out.println("eneter the correst input value");
      int b=sc.nextInt();
      int d=sc.nextInt();
      int sum=b/d;
      System.out.println(sum);
      }


  }
}