import java.util.Scanner;
class SortingArray
  {
    public static void Sort(int a[],int size)
    {
      int temp=0,i,j;
      for(i=0;i<size;i++)
        {
          for(j=i+1;j<size;j++)
            {
              if(a[j]<a[i])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
      System.out.println("after sorting the array:");
      for(i=0;i<size;i++)
        {
          System.out.println(a[i]+" ");
        }
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array:");
      int size=sc.nextInt();
      System.out.println("enter the elements in array:");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      Sort(a,size);
    }
    }