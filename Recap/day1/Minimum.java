import java.util.Scanner;
class Minimum
  {
    public static void Min(String str)
    {
      String st[]=str.split(" ");
      int min=st[0].length();
      String str1="";
      for(int i=0;i<st.length;i++)
        {
          int length=st[i].length();
          if(min>length)
          {
            min=length;
            str1=st[i];
          }
        }
      System.out.println("the string of minimum word is:" +str1);
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string ");
      String s=sc.nextLine();
      Min(s);
    }
    
  }
