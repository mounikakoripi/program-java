//Print duplicate elements from array
class Duplicate
  {
    public static void main(String []args)
    {
      int a[]={2,4,5,6,2,5,7,6};
        System.out.println("duplicate elements:");
      for(int i=0;i<a.length;i++)
        {
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
                System.out.println(a[i]+" ");
              }
            }
        }
    }
  }