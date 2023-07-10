//import java.util.Scanner;
class Exampl
  {
    public static void main(String []args)
    {
     String st="message";
      System.out.println(st);
      char[] ch=st.toCharArray();
      for(char c: ch)
        {
          c+=1;
          System.out.println(c);
        }
     }
  }