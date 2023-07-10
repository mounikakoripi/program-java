import java.util.Scanner;
class Bracket
  {
    public static void main(String []args)
    {
      Bracket_matcher bm=new Bracket_matcher();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
    int b=bm.bracketMatcher(str);
      if(b==1)
      {
        System.out.println("correct bracket matcher:");
      }else{
          System.out.println("incorrect bracket matcher");
            }
    }
  }
 class  Bracket_matcher
  {
  public int bracketMatcher(String s1)
    {
      char ch;
     int openbracket=0,closebracket=0;
      for(int i=0;i<s1.length();i++)
        {
          ch=s1.charAt(i);
          if(ch=='(')
          {
            openbracket++;
          }
          else if(ch==')'){
        closebracket++;
        }
        }
        if(openbracket==closebracket)
          return 1;
         else
        return 0;
        
  }
  }
