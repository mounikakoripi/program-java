import java.util.*;
class TreesetInt
  {
    public static void main(String []args)
    {
      TreeSet<Integer> ti=new TreeSet<Integer>();
      ti.add(1);
      ti.add(25);
      ti.add(0);
      ti.add(11);
      ti.add(18);
      System.out.println(ti);
      ti.remove(11);
      System.out.println(ti);
      
    }
  }