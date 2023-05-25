//WAP to find first occurrence of a character in a given string.
import java.util.Scanner;
class FirstOccurence
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.next();
        //System.out.println("enter the character to find the last occurance index position in the given string");
     char ch=sc.next().charAt(0);
      int i;
      for(i=0;i<str.length();i++)
        {
          if(str.charAt(0)==ch)
          {
            break;
          }
        }
           System.out.println(i);
        
     
    }
  }