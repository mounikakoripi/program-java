//WAP to find total number of alphabets, digits or specialcharacter in a string.
import java.util.Scanner;
class AlphaDigitSpecial
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      String str="bitlabs@123";
      int s=0;
      int digit=0;
      int a=0;
        char c=str.charAt(0);
      for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
        
      if((ch>='a'&& c>='z')||(ch>='A'&& ch>='Z'))
      {
        a++;
      }
       else if(ch>='0'&& ch<='9')
              {
        digit++;
              }
       else
       s++;
        }
      System.out.println("alphabets are:"+a);
      System.out.println("digits are:"+digit);
      System.out.println("the count of special character in string are:"+s);
        }
       }
  