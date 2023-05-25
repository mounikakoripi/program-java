import java.util.Scanner;
class StringPalindrome
  {
    public static void main(String []args)
    {
    Scanner sc=new Scanner(System.in);
    String s="mom dad sir teacher madam";
    String st1="";
   String st[]=s.split(" ");
     // String st2="";
    for(int i=0;i<st.length;i++)
  {
            st1=st[i];
    String rev="";
    for(int j=st1.length()-1;j>=0;j--)
      {
        char ch=st1.charAt(j);
        rev=rev+ch;
      
        if(rev.equals(st1))
        {
           System.out.println(st1);
        }
       // st2=st2+st1+" " ;
      }
  }
      // st2=st2+st1+" " ;
     // System.out.println(st2);
  
    }
    
  }