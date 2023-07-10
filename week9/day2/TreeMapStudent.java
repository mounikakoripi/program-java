import java.util.*;
class Student
  {
  private  String Name;
   private double  Marks;
    String Section;
    public Student(String name,double marks)
    {
      this.Name=name;
      this.Marks=marks;
    }
  public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getMarks() {
		return Marks;
	}
	public void setMarks(double marks) {
		Marks = marks;
  }
    public String toString(){
    return this.Name+" "+this.Marks;
	}
   }
class MyComperator implements Comparator
  {
    public int compare(Object obj1,Object obj2)
    {
      Student s1 = (Student)obj1;
      Student s2 = (Student)obj2;
    if(s1.getMarks()<s2.getMarks())
    {
      return +1;
    }
    else if(s1.getMarks()>s2.getMarks())
    {
      return -1;
    }
    else {
      return 0;
    }
  }
  }
class TreeMapStudent
  {
    public static void main(String []args)
    {
      TreeMap<Student,String>tm=new TreeMap<Student,String>(new MyComperator());
      tm.put(new Student("mounika",85),"k");
      tm.put(new Student("Sadhvi",92),"B");
      tm.put(new Student("puri",75),"B");
      System.out.println(tm);
      Set entires=tm.entrySet();
      for(Object o:entires)
      {
        Map.Entry e=(Map.Entry)o;
        System.out.println("key is:"+e.getKey()+"-->"+"Value is:");
        System.out.println(e.getValue());
      }
        
    }
  }