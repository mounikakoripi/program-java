/*Challenge 3:
Scenario:
You are building a student management system for a school that allows teachers to manage student information. The system should be able to add new students, display student details, calculate average marks, and handle exceptions for invalid inputs. Your task is to create a Java program that implements the necessary classes and methods to achieve these functionalities.*/
import java.util.Scanner;
class Student
  {
    int sid;
    String sname;
    int subjectmarks;
    float averagemarks;
   public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSubjectmarks() {
		return subjectmarks;
	}
	public void setSubjectmarks(int subjectmarks) {
		this.subjectmarks = subjectmarks;
	}
	public float getAveragemarks() {
		return averagemarks;
	}
	public void setAveragemarks(float averagemarks) {
		this.averagemarks = averagemarks;
	}
}
class StudentMarks
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      Student[] s=new Student[3];
      s[0]=new Student();
      s[1]=new Student();
      s[2]=new Student();
      for(int i=0;i<=3;i++)
        {
          System.out.println("student details:");
          System.out.println("enter the student id:");
          s[i].sid=sc.nextInt();
          System.out.println("enter the student name:");
          s[i].sname=sc.next();
          System.out.println("enter the subject1 marks:");
          s[i].subjectmarks=sc.nextInt();
          System.out.println("enter the subject2 marks:");
          s[i].subjectmarks=sc.nextInt();
          System.out.println("enter the subject3 marks:");
          s[i].subjectmarks=sc.nextInt();
          System.out.println("enter the subject4 marks:");
          s[i].subjectmarks=sc.nextInt();
          System.out.println("enter the subject marks:");
          s[i].subjectmarks=sc.nextInt();
          System.out.println("enter the average marks:");
          s[i].averagemarks=sc.nextFloat();
           }
      for(int i=0;i<=3;i++)
        {
          
          System.out.println("student id:"+s[i].sid);
          System.out.println("student name:"+s[i].sname);
          System.out.println("subject marks:"+s[i].subjectmarks);
          System.out.println("subject2 marks:"+s[i].subjectmarks);
          System.out.println("subject3 marks:"+s[i].subjectmarks);
          System.out.println("subject4.marks:"+s[i].subjectmarks);
          System.out.println("Subject5.marks:"+s[i].subjectmarks);
          System.out.println("average marks:"+s[i].averagemarks);
          
        }
      
    }
  }