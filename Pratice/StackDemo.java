import java.util.*;
class StackDemo
  {
    private int arr[];
    private int top;
    private int capacity;
    //creating stack size;
   StackDemo(int size)
    {
       arr=new int [size];
      capacity=size;
      top=-1;
    }
    public void push(int value)
    {
      if(isFull())
      {
        System.out.println("stack is overflow");
       System.exit(1);
        }
       top++;
      arr[top]=value;
      System.out.println("inserting :"+value);
      //top++;
      //arr[top]=value;
    }
    public int pop()
    {
      if(isEmpty())
      {
        System.out.println("stack is empty");
        System.exit(1);
      }
      return arr[top--];
    }
    public int getSize()
    {
      return top+1;
    }
    public Boolean isEmpty()
    {
      return top==-1;
    }
    public Boolean isFull()
    {
      return top==capacity-1;
    }
    public void printStack()
    {
      for(int i=0;i<=top;i++)
        {
        System.out.println(arr[i]+" ");
        }
    }
    public static void main(String []args)
    {
      StackDemo s=new StackDemo(5);
      s.push(23);
      s.push(11);
       s.push(20);
      s.push(56);
      System.out.println("Stack:");
      s.printStack();
      s.pop();
      System.out.println("\n After popping out:");
      s.printStack();
    }
    
  }