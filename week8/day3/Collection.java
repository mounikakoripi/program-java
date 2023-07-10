import java.util.*;
class Collection
  {
    public static void main(String []args)
    {
      ArrayList al=new ArrayList();
      al.add("mom");
      al.add("dad");
      al.add("son");
      al.add("sis");
      al.add("abc");
      al.add(45);
      al.add(85);
      System.out.println(al);
     System.out.println(al.size());
      ArrayList al1=new ArrayList();
      al1.add("mom");
      al1.add("dad");
      al1.add("son");
      System.out.println(al1);
      System.out.println(al.removeAll(al1));
      System.out.println(al);
      System.out.println(al.removeAll(al1));
      System.out.println(al.size());
      Iterator itr=al.iterator();
      while(itr.hasNext())
        System.out.println(itr.next()+"  ");
    
              
    }
  }