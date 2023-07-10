class Second
  {
    public static void main(String []args)
    {
      String s="mounika";
      String s1="srinivas";
      String s2="mounika";
      String s3=new String("SRINIVAS");
      System.out.println(s.compareTo(s2));
     s2="mounika ";
       System.out.println("trim()"+s.compareTo(s2.trim()));
        System.out.println(s.length()==s2.length());
      System.out.println(s1.compareTo(s3));
      System.out.println(s.concat(s3));
      String s4="welcome to my home";
      System.out.println(s4.contains("to"));
    System.out.println(s4.endsWith("to"));
     System.out.println(" equals "+s1.equals(s3)); System.out.println(" equalsignoreCase      " +s1.equalsIgnoreCase(s3));
      System.out.println(" lastindexOf() "+s4.lastIndexOf('e')); 
      System.out.println(" replace() "+s4.replace('e','m')); 
      System.out.println("subString() "+s4.substring(5,7)); 
      
      
       
    }
    
    
  }
  