import java.util.*;
class Collections
  {
    public static void main(String []args)
    {
      ArrayList<String> al=new ArrayList<String>();
      al.add("abc");
      al.add("bcd");
      al.add("edd");
      System.out.println(al);
      //inserting a element
      al.set(2,"efg");
      System.out.println(al);
      //iteration
      for(String name:al)
        {
        System.out.println(name);
        }
      List<Integer> l=new ArrayList<Integer>();
      l.add(25);
      l.add(32);
      l.add(23);
      System.out.println(l);
    }
  }