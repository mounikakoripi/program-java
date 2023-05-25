import java.util.Scanner;
class Menu
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size:");
      int n=sc.nextInt();
      int a[]=new int[n+1];
      System.out.println("******menu****");
        System.out.println("\n 1.insert an element first index \n 2.insert an element last index \n 3.insert an element specified index \n 4.remove an element first index \n 5.remove an element last index \n 6. remove an element specified index:");
      System.out.println("enter the choice:");
      int choice=sc.nextInt();
      System.out.println("enter the array element");
      //int b[]=new int[a.length+1];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      switch(choice)
        {
          case 1:
            Insertele(a,n);
            System.out.println("after insert the element");
            for(int i=0;i<n;i++)
              System.out.println(a[i]+" ");
            
        }
        
    }
    public static void Insertele(int a[],int n)
    {
      Scanner s=new Scanner(System.in);
  
     System.out.println("enter the position where you wnat insert element");
    int pos=s.nextInt();
      System.out.println("enter the insert element");
      int x=s.nextInt();
      for(int i=(n-1);i>=(pos-1);i--) 
        {
          a[i+1]=a[i];
         }
      a[pos-1]=x;
    
    }

    public static void 
  }