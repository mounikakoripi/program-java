import java.util.*;
class TreesetMain
  {
    public static void main(String []args)
    {
      TreeSet ts=new TreeSet(new MyComparator());
      ts.add("B");
      ts.add("C");
      ts.add("A");
      ts.add("F");
      ts.add("E");
      ts.add("a");
      System.out.println(ts);
     }
  }
class MyComparator implements Comparator
  {
    public int compare(Object obj1,Object obj2)
    {
      String s1=(String)obj1;
      String s2=(String)obj2;
      /*if(s1<s2)
        return +1;
      else if(s1>s2)
        return -1;
      else
        return 0;*/
      return s1.compareTo(s2);
    }
  }