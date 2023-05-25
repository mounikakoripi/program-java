//Write a program that takes a sentence as input and capitalizes the first letter of each word in the sentence. Assume that words are separated by spaces.
import java.util.Scanner;
class Sentance
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the sentance:");
      String st=sc.nextLine();
      captial(st);
    }
    public static void captial(String s)
    {
      String str[]=s.split("");
      String original="";
       for(int i=0;i<str.length;i++)
        {
          String temp=str[i];
      char ch[]=temp.toCharArray();
          String str2="";
       for(int j=0;j<ch.length;j++)
          {
            if(j==0)
            {
          ch[j]= Character.toUpperCase(ch[j]);
            } 
          str2=str2+ch[j];
          }
          
            original=original+str2;
        }
          System.out.println(original);
  }
  }






 


      

 


      
        

 

       
    

 

