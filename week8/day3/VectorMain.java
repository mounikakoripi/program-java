import java.util.*;
class VectorMain
  {
    public static void main(String []args)
    {
     Vector<String> vec=new Vector<String> (2);
       vec.addElement("book");
     vec.addElement("pen");
     vec.addElement("pencil");
      vec.addElement("bag");
      System.out.println(vec);
      System.out.println("v.size:"+vec.size());
      System.out.println("Default capacity of vector:"+vec.capacity());
      vec.addElement("x");
      vec.addElement("y");
      System.out.println("v.size:"+vec.size());
      System.out.println("after increment capacity of vector:"+vec.capacity());
      Enumeration e=vec.elements();
      System.out.println("\nelements are:");
      while(e.hasMoreElements())
        System.out.println(e.nextElement());
    }
  }