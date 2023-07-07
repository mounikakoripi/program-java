import java.util.*;
class StackSort
  {
   private  int arr[];
   private  int top;
   private int capacity;
     StackSort(int size)
    {
      arr=new int[size];
     capacity=size;
      top=-1;
    }
    public void push(int value){
      if(isFull())
      {
        System.out.println("stack is overflow:");
        System.exit(1);
      }
      System.out.println("inserting stack value:");
      top++;
      arr[top]=value;
    }
    public int pop()
    {
      if(isEmpty()){
      System.out.println("stack is empty:");
      System.exit(1);
     }
      return arr[top--];
    }
    public int peek()
    {
      if(isEmpty()){
      System.out.println("stack is empty no top of the elements:");
    return -1;
      }
      else{
        return arr[top];
      }
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
        System.out.println(arr[i]+" ");
      }
    public static void main(String []args)
    {
      StackSort s=new StackSort(5);
      s.push(23);
      s.push(11);
      s.push(20);
     s.push(21);
     // System.out.println(s);
     System.out.println("stack is:");
      s.printStack();
      System.out.println("stack size is:"+s.getSize());
      s.pop();
      System.out.println("top element is:"+s.peek());
      
      System.out.println("After sorting is:");
      s.printStack();
      
    }
  }
