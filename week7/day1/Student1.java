import java.util.Scanner;
class Student
  {
    String name;
    int id;
    float fee;
}
class Student1
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      Student s[]=new Student[3];
      s[0]=new Student();
      s[1]=new Student();
      s[2]=new Student();
        for(int i=0;i<3;i++)
        {
      // sc.nextLine();
      System.out.println("enter the student name:");
      s[i].name=sc.nextLine();
          System.out.println("enter the student id:");
          s[i].id=sc.nextInt();
          System.out.println("enter the student fee");
          s[i].fee=sc.nextFloat();
          sc.nextLine();
        }
      for(int i=0;i<3;i++)
        {
          System.out.println("student name is "+s[i].name);
          System.out.println("Student id is:"+s[i].id);
          System.out.println("student fee is:"+s[i].fee);
        }
    }
  }