import java.util.Scanner;
class Unique
  {
    public static void main(String []args)
    {
      int a[]={2,3,4,1,2,3,5};
      int size=a.length;
      boolean b[]=new boolean[size];
      for(int k=0;k<a.length;k++)
        {
          b[k]=false;
        }
      System.out.println("unique elements are:");
      for(int i=0;i<a.length;i++)
        {
          int count=1;
          if(b[i]==true)
            continue;
            for(int j=i+1;j<a.length;j++)
              {
                if(a[i]==a[j])
                {
                  count++;
                  b[j]=true;
                }
              }
          if(count==1)
            System.out.println(a[i]+" ");
          }
        }
    }
  