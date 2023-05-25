import java.util.Scanner;
class CopyArr
  {
    public static void copy(int a[],int b[],int size)
    {
      for(int i=0;i<size;i++)
        {
          b[i]=a[i];
        }
      System.out.println("the newly created array are elements:");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]+" before copy ");
        }
      for(int i=0;i<size;i++)
        {
          System.out.println(b[i]+" ");
        }
      }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array element:");
      int size=sc.nextInt();
      int a[]=new int[size];
      int b[]=new int[size];
      System.out.println("enter the  array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
          }
        copy(a,b,size);
     }
    }
    
  