import java.util.Scanner;
class ReverString
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String reverse="";
       String temp=str;
      for(int i=str.length()-1;i>=0;i--)
        {
          reverse=reverse+str.charAt(i);
        }
          System.out.println(reverse);
      if(tempequals(reverse))
      {
        System.out.println("the string is palindrome");
      }
      else
      {
        System.out.println("the string is palindraome");
      }
    }
  }