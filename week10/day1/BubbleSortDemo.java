import java.util.Scanner;
class Sort
  {
    public void bubbleSort(int arr[],int n)
    {
      for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<(i+1);j++)
            {
              if(arr[j]>arr[j+1])
              {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
            }
          }
      printArray(arr,n);
    }
    static void printArray(int arr[],int n)
    {
      System.out.println("the sorted array is:");
      for(int i=0;i<n;i++)
        System.out.println(arr[i]+" ");
      System.out.println();
    }
    
  }
class BubbleSortDemo
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("the size of the array is:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("enter the "+n+" elements in array:");
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      Sort s=new Sort();
      s.bubbleSort(arr,n);
    } 
  }