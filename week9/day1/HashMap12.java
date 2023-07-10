import java.util.*;
class HashMap12
  {
    public static void main(String []args)
    {
      HashMap hm=new HashMap();
      hm.put("M","Mounika");
      hm.put("S","Srinivas");
      hm.put("k","koripi");
      hm.put("D","dikishith");
      hm.put("L","Liyaansh");
      System.out.println(hm);
      HashMap hm1=new HashMap();
      hm1.put("T","Tenali");
      hm1.put("O","Ongole");
      System.out.println(hm1);
      hm.putAll(hm1);
      System.out.println(hm);
      System.out.println(hm.get("D"));
      System.out.println(hm.remove("S"));
      System.out.println(hm.size());
      System.out.println(hm.keySet());
      System.out.println(hm.containsValue("Dikishith"));
      System.out.println(hm.containsKey("L"));
      System.out.println(hm.values());
    Set keys=hm.keySet() ;
      for(Object k:keys)
      System.out.println(k+"-->"+hm.get(k));
      Set entires=hm.entrySet();
        for(Object o:entires)
          {
          Map.Entry e = (Map.Entry) o;
        //Map.Entry e=(Map.Entry)o;
      System.out.println(e.getKey()+"-->"+e.getValue());
         }
    }
  }