import java.util.*;
class LinkedHashSet
  {
    public static void main(String []args)
    {
      HashSet<String> hs=new HashSet<String>();
      hs.add("x");
      hs.add("avb");
      hs.add("y");
      hs.add("bcd");
      System.out.println("Hashset:"+hs);
      hs.add("avb");
      hs.add("bcd");
      hs.remove("y");
      System.out.println("Hashset:"+hs); 
      LinkedList<String> ls=new LinkedList<String>();
      ls.add("x");
      ls.add("avb");
      ls.add("y");
      ls.add("bcd");
      System.out.println("linkedlisthashset:"+ls);
      ls.remove("avb");
      System.out.println("linkedlisthashset:"+ls);
      Iterator it=hs.iterator();
      while(it.hasNext())
        {
          System.out.println(it.next());
        }
        
  }
  }