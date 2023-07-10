import java.util.Scanner;
class Sort
  {
    public void inserSort(int arr[],int n)
    {
      for(int i=1;i<n-1;i++)
        {
          for(int j=i-1;j>0;j++)
            {
             int key=arr[i];
               //j=i-1;
         if(key<arr[j])
              {
                arr[j+1]=arr[j];
                j=j+1;
              }
              else
              {
                break;
              }
              arr[j+1]=key;
            }
          printArray(arr,n);
        }
    }
    static void printArray(int arr[],int n)
    {
      System.out.println("enter the sort element is:");
      for(int i=0;i<n;i++)
        System.out.println(arr[i]+" ");
      System.out.println();
    }
    
  }
class InsertionSort
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size:");
      int n=sc.nextInt();
    int arr[]=new int[n];
      System.out.println("enter the "+n+" elements in array");
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      Sort s=new Sort();
      s.inserSort(arr, n);
    }
  }