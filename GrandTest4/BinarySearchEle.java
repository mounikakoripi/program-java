import java.util.*;
class BinarySearch{
  public int binarySearch(int narr[],int n,int key)
  {
    int low =0,mid,high=n-1;
    while(low<=high)
      {
        mid=(low+high)/2;
        if(narr[mid]==key)
        return mid;
       else if(key>narr[mid])
           low=mid-1;
        else if(key<narr[mid])
           high=mid+1;
       }
    return -1;
  }
  public void prime()
  {
    Scanner sc1=new Scanner(System.in);
    System.out.println("enter the n elements:");
    int n=sc1.nextInt();
    for(int i=0;i<n;i++)
      {
        if(i%2==0)
        {
          System.out.println("the number is prime number:");
          }
        else{
          System.out.println("the number is not prime number:");
        }
      }
  }
  
}

class BinarySearchEle
  {
    public static void main(String []args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the total number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n]; 
    System.out.println("entet the number of elements in array");
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      System.out.println(" enter the key element searched:");
      int key=sc.nextInt();
      BinarySearch bs=new BinarySearch();
      int result=bs.binarySearch(arr, n, key);
      if(result==-1)
      {
        System.out.println("the key is not found:");
      }
      else {
        System.out.println("the key is element is:"+result);
      }
  }
  }