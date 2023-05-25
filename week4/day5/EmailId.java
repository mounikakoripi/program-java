//valid password or invalid password
import java.util.Scanner;
class EmailId
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int acount=0,dcount=0,scount=0;
      char ch;
       System.out.println("enter your email id:");
      String emailid=sc.next();
      for(int i=0;i<emailid.length();i++)
        {
          ch=emailid.charAt(i);
          if(ch>='a'&& ch<='z')
          {
            acount++;
          }
         else if(ch>='0'&&ch<='9')
         {
            dcount++;
          }
          else
          {
            scount++;
          }
        }
          if(acount>0&&dcount>0&&scount>0)
          {
            System.out.println("valid email id ");
              
          }
          else
          {
            System.out.println("invalid email id");
          }
    }
  }