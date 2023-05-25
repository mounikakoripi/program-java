
//find the maximum length of the word
import java.util.Scanner;

class Maximum {
  public static void max(String str) {
    // char ch[]=str.toCharArray();
    // int size=ch.length;
    String str1[] = str.split(" ");
    int max = 0;
    String str2 = "";
    for (int i = 0; i < str1.length; i++) {
      int length = str1[i].length();

      if (max < length) {
        max = length;
        str2 = str1[i];
      }
    }

    System.out.println("the string is maximum word is dispaly:" + str2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string:");
    String st = sc.nextLine();
    max(st);

  }
}