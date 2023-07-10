import java.util.*;
/*class Mycomparator implements Comparator<Customer>
  {
    public int compare(Customer obj1,Customer obj2)
    {
      Customer ct1=(Customer)obj1;
      Customer ct2=(Customer)obj2;
   return ((obj1.cadd).length())-((obj2.cadd).length()); 
    }
  }*/
class Customer
  {
    String cname;
    int cno;
    String cadd;
    public Customer(String name,int no,String add)
      this.cname=name;
      this.cno=no;
      this.cadd=add;
    }
	
  }
class Test9
  {
    public static void main(String []args)
    {
      TreeSet<Customer> ts=new TreeSet<>();
      Customer ct1=new Customer("mounika",23,"ongol");
      Customer ct2=new Customer("sadhvi",25,"hyd");
      Customer ct3=new Customer("puri",30,"kdk");
      Customer ct4=new Customer("chandna",45,"vijaya");
      ts.add(ct1);
      ts.add(ct2);
      ts.add(ct3);
      ts.add(ct4);
      System.out.println(ts);
      for(Customer ct:ts)
        {
          System.out.println(ct);
        }
    }
  }
class MyComparator implements Comparator<Customer>
  {
    public int compare(Customer obj1,Customer obj2)
    {
      Customer ct1=(Customer)obj1;
      Customer ct2=(Customer)obj2;
   return ((obj1.cadd).length())-((obj2.cadd).length()); 
    }
  }