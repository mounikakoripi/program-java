import java.util.Scanner;
class Sort
  {
    public void selectionSort(int a[],int n)
    {
      int index=0;
      for(int i=0;i<n-1;i++)
        {
          int min=a[i];
         for(int j=i+1;j<n;j++)
           {
             if(a[j]<min)
             {
              min=a[j];
               index=j;
             }
           }
         int temp=a[i];
          a[i]=min;
          a[index]=temp;
        }
  System.out.println("after sorting elements:");
      for(int i=0;i<n;i++)
        {
        System.out.println(a[i]+" ");
        }
    }
  }
class Sorting
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of  elements:");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the elements into the array");
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      Sort s=new Sort();
      s.selectionSort(a, n);
    }
  }