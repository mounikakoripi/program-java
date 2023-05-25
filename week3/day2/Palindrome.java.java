import java.util.Scanner;
class Palindrome
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      String  s []= {"mom","sir","dad","madam","teacher"};
      for(int i=0;i<s.length;i++)
        {
          String rev="";
          String temp=s[i];
          for(int j=temp.length()-1;j>=0;j--)
            {
              rev=rev+temp.charAt(j);
            }
          System.out.println(rev);
        }
      if(temp.equals(rev))
      {
        System.out.println(temp);
        }
    
      }
    }
  