import java.util.Scanner;
class Deleting
  {
    public static void Delet(int a[],int size,int pos)
    {
      System.out.println(" after delteing the array element:");
      for(int i=pos;i<size-1;i++)
        {
          a[i]=a[i+1];
        }
      for(int i=0;i<size-1;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array:");
      int size=sc.nextInt();
      System.out.println("enter the array elements:");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter the position where are positon delete:");
      int pos=sc.nextInt();
      System.out.println("before delete element:");
      for(int i=0;i<size;i++)
        {
          System.out.print(a[i]+" ");
        }
      Delet(a,size,pos);
    }
  }