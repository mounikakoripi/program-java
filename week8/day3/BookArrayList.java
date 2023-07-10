import java.util.ArrayList;
class Book
  {
    String titile;
    double price;
    String author;
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
  }
class BookArrayList
  {
    public static void main(String []args)
    {
     // Scanner sc=new Scanner(System.in);
      ArrayList<Book> books=new ArrayList<Book>();
      //creating object
      Book b1=new Book("Think staright",200.00,"darius");
      Book b2=new Book("rich dad and poor dad",250.00,"Robert");
      Book b3=new Book("xyz",250.00,"abc");
      books.add(b1);
      books.add(b2);
      books.add(b3);
      for(Book bk:books)
        {
          System.out.println("Titile:"+bk.getTitile());
          System.out.println("Price:"+bk.getPrice());
          System.out.println("Author:"+bk.getAuthor());
        }
      }
  }