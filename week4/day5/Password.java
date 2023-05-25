//valid password or invalid password
import java.util.Scanner;
class Password
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int acount=0,lcount=0,dcount=0,scount=0;
      System.out.println("enter the your password");
      String password=sc.next();
      char ch;
      for(int i=0;i<password.length();i++)
        {
          ch=password.charAt(i);
          if(ch>='A'&&ch<='z')
          {
            acount++;
          }
          else if(ch>='a'&&ch<='z')
          {
            lcount++;
            
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
      if((acount>=1)&&(dcount>=1)&&(scount>=1))
      {
        System.out.println("the password is storng  and valid password");
      }
      else
      {
      System.out.println("the password is not strong and invalid password");
      }
    }
  }