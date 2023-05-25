//WAP to check whether a string is palindrome or not
import java.util.Scanner;
class Palindraom
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      String reverse="";                     
      System.out.println("enter the string");
      String str=sc.nextLine();
     // String str1[]=str.split("");
      for(int i=(str.length()-1);i>=0;i--)
      {
        reverse=reverse+str.charAt(i);
      }
      if(str.equals(reverse))
      {
        System.out.println(" the string is palindraom:"+str);
        
      }
      else
      {
        System.out.println("the string is not palindraom:"+str);
      }
    }
  }