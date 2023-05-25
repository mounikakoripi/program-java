import java.util.Scanner;
class EncryptDecrypt
  {
    public static void encryptCode(String str)
    {
      char ch[]=str.toCharArray();
      //int size=ch.length;
     String em="";
    for(int i=0;i<ch.length;i++)
        {
          int value=ch[i]+1;
         System.out.println(value);
         }
      for(int i=0;i<ch.length;i++)
        {
          int value=ch[i]+1;
          char cha=(char)value;
          em=em+cha;
        }
        System.out.println("the string emcrypt id"+em);
        }
    public static void decryptCode(String str)
    {
      int i;
      String de="";
      char cha[]=str.toCharArray();
      //int size=cha.length;
      for(i=0;i<cha.length;i++)
        {
          int value=cha[i]-1;
          System.out.println(value);
        }
      for(i=0;i<cha.length;i++);
      {
      int value=cha[i]-1;
      char ch=(char)value;
      de=de+ch;
        }
      System.out.println(de);
      
    }
public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string:");
      String st=sc.nextLine();
     // encryptCode(str);
      decryptCode(st);
    }
  }