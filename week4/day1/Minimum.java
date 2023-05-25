//Wap to find the Minimum element in array
import java.util.Scanner;
class Minimum
  {
    public static void Minimum(int a[],int size)
    {
      int min=a[0];
      for(int i=0;i<size;i++)
        {
          if(min>a[i])
          {
            min=a[i];
          }
        }
      System.out.println("the minimum elements in dispaly array:"+min);
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array:");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements:");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      Minimum(a,size);
    }
  }