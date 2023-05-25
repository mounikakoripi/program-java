import java.util.Scanner;
class Split
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      String st="welcome to the bitlabs training";
      String str[]=st.split("");
      for(int i=0;i<str.length;i++)
        {
          System.out.print(str[i]);
        }
      System.out.println();
    }
  }