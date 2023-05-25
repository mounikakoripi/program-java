import java.util.Scanner;
class Lastword
  {
    public static void last(String str)
    {
      String st[]=str.split(" ");
      String last;
      String st1="";
      for(int i=st.length-1;i>0;i++)
        {
        last=st[i];
          st1=st[i];
          break;
        }
      System.out.println("the last word is"+st1);
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string ");
      String s=sc.nextLine();
      last(s);
    }
  }
