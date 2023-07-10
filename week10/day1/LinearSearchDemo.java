import java.util.Scanner;
class LinearSearch
  {
    public int linSearch(int narr[],int n,int key)
    {
      for(int i=0;i<n;i++)
        {
          if(key==narr[i])
          {
            return i;
          }
        }
    
    return -1;
  }
  }
class LinearSearchDemo
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the total number of array:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("enter the "+n+" elements:");
      for(int i=0;i<n;i++)
        {
         arr[i]=sc.nextInt();
        }
      System.out.println("enter the key value to be searched");
      int key=sc.nextInt();
      LinearSearch ls=new LinearSearch();
      int pos=ls.linSearch(arr,n,key);
      if(pos!=-1)
      {
        System.out.println("the key is found in the element pos:"+(pos+1));
        }
      else{
        System.out.println("the key is not found");
      }
    }
  }