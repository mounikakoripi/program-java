/*You are working on a text editor application that allows users to write sentences. As part of an enhancement to the application, you need to implement a feature that automatically capitalizes the first letter of each word in a sentence. This will make the text appear more visually appealing and adhere to standard writing conventions. You are tasked with writing a program in Java to accomplish this.
For example, if the user enters "the quick brown fox jumps over the lazy dog", the program should output "The Quick Brown Fox Jumps Over The Lazy Dog".*/

 import java.util.Scanner;
class Captilize
  {
    public static void main(String []args)
    {
      //Scanner sc=new Scanner(System.in);
      Captilize_String cs=new Captilize_String();
     cs.captilizeString();
    }
  }
    class Captilize_String
      {
    public void captilizeString()
    {
        Scanner sc=new Scanner(System.in);
      char f_char,ch;
      String rem_String="";
      String word="";
      String final_string="";
      System.out.println("enter the sentence:");
      String sentance=sc.nextLine();
     String[] words=sentance.split(" ");
      for(int i=0;i<words.length;i++)
        {
           ch=words[i].charAt(0);
          if(ch>='a'&&ch<='z')
          {
            f_char=(char)(ch-32);
            rem_String=words[i].substring(1);
            word=f_char+rem_String;
            }
          else{
            word=words[i];
          }
          final_string=final_string+word+" ";
        }
      System.out.println(final_string);
    }
  }


