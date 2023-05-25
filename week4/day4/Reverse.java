//WAP to find reverse of a string.
import java.util.Scanner;
class Reverse
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.next();
      String reverse="";
      for(int i=str.length()-1;i>=0;i--)
        {
          reverse=reverse+str.charAt(i);
        }
      System.out.println("the string reverse is:"+reverse);
    }
  }