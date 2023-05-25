//WAP to find maximum  element in an array
import java .util.Scanner;
class MaxArr
  {
    public static void maximum(int size,int a[])
    {
      int max=a[0];
      for(int i=0;i<size;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
        }
      System.out.println("the maximum elements are dispaly in the array:"+max);
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array:");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elemenets");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      maximum(size,a);
    }
     }