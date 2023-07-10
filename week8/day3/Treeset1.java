import java.util.*;
class Treeset1
  {
    public static void main(String []args)
    {
      TreeSet<String> t=new TreeSet<String>();
      t.add("Mouni");
      t.add("koripi");
      t.add("U");
      t.add("N");
      t.add("n");
     System.out.println("TreeSet:"+t);
      t.remove("N");
        System.out.println("TreeSet:"+t);
    }
}