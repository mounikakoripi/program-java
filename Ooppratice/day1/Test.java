class ThisExample
  {
    int x;
    int y;
  ThisExample(int x,int y)
    {
      this.x=x;
      this.y=y;
      System.out.println("before passing this  to addTwo() method");
      System.out.println("x= " +this.x+",y="+this.y);
      
      add(this);
        
        System.out.println("after passing this to addtwo() method");
        System.out.println("x= "+this.x+",y="+this.y);
        }
    void add(ThisExample ob)
    {
      ob.x+=2;
      ob.y+=2;
    }
   }
class Test
  {
    public static void main(String []args)
    {
      ThisExample obj=new ThisExample(2,2);
    }
  }