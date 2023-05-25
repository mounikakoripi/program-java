import java.util.Scanner;
class StringReverse
  {
    public static void main(String args [] )
    {
      Scanner sc = new Scanner(System.in);
      String s [] = {"mom","dad","teacher","madam","sir"};
       for(int i=0;i<s.length;i++)
        {
        String temp=s[i];
          String rev="";
        for(int j=temp.length()-1;j>=0;j--)
          {
            
          char ch=temp.charAt(j);
           rev= rev+ch;
          
          if(rev.equals(temp))
          {
            System.out.println(temp);
          }
        
        }
        }
          }
  }
  