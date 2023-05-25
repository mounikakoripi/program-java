import java.util.Scanner;
class Delete
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int a[]={12,15,22,35,16};
      System.out.println("delete the element:");
      int value=sc.nextInt();
      System.out.println("delete the position:");
      int pos=sc.nextInt();
      for(int i=0;i<a.length-1;i++)
        {
          if(i==pos)
          {
            a[i]=a[i+1];
          }
          else if(i>pos)
          {
            a[i]=a[i+1];
          }
         // else{
            //continue;
        //  }
          }
      System.out.println("the elements array are:");
      for(int i=0;i<a.length-1;i++)
        System.out.print(a[i]+" ");
        }
  }