class College
  {
    String collegename;
    public void MethodA()
    {
      System.out.println("display college details:");
    }
  }
class Student extends College{
  String name;
  String branch;
  int rollno;
  String collegename;
 Student(String name,String branch,int rollno,String collegename)
  {
this.name=name;
    this.branch=branch;
    this.rollno=rollno;
    this.collegename=collegename;
  }
    public void display(){
    System.out.println("name is:"+name+ " "+"\nbranch is:" +branch+ " " +"\nrollno is:" +rollno+"\ncollegename is:"+collegename);
  }
}
class MultilevelInheritance
  {
    public static void main(String []args)
    {
    Student s1= new Student("mounika","cse",1,"Rise");
      s1.MethodA();
      s1.display();
      //s1.MethodA();
  }
  }