//wap to find sum of array
import java.util.Scanner;
class SumOfArray
  { 
    public static void Sum(int a[],int size)
    { 
      int sum=0;
      System.out.println("add numbers:");
      for(int i=0;i<a.length;i++)
        {
           sum=sum+a[i];
          //System.out.println(sum+" ");
          
        }
      System.out.println(sum+" ");
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt(); 
      System.out.println("enter the elements");
      int a[]=new int[size];
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      Sum(a,size);
    }
  }