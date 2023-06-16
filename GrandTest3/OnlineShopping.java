/*2. Scenario: Online Shopping Platform Product Data Input
You are a software developer working for an online shopping platform. The platform allows customers to purchase a wide variety of products. Your task is to develop a program that allows the platform administrators to input product data dynamically and validate the inputs according to specific requirements. The program should also display the data for all the products entered.*/
import java.util.Scanner;
class Product
  {
     String id;
      String Name;
      float Price;
     String Category;
    int QuantityinStock;
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
	this.Name = name;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		this.Price = price;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		this.Category = category;
	}
	public int getQuantityinStock() {
		return QuantityinStock;
	}
	public void setQuantityinStock(int quantityinStock) {
		this.QuantityinStock = quantityinStock;
	}
	 }
class OnlineShopping
  {
    public static void main(String []args)
    { 
      Scanner sc=new Scanner(System.in);
      Product[] p=new Product[5];
      p[0]=new Product();
      p[1]=new Product();
      p[2]=new Product();
      p[3]=new Product();
      p[4]=new Product();
      for(int i=0;i<=5;i++)
      {
       System.out.println("enter the product id");
        p[i].id=sc.next();
        System.out.println("enter the product name");
        p[i].Name=sc.next();
        System.out.println("enter the product price:");
        p[i].Price=sc.nextFloat();
        System.out.println("enter the product category:");
        p[i].Category=sc.next();
        System.out.println("enter the product Quntity in stock:");
        p[i].QuantityinStock=sc.nextInt();
       // sc=nextLine();
      }
      for( int i=0;i<5;i++)
        {
            System.out.println("product id:"+p[i].id);
            System.out.println("product name is:"  +p[i].Name);
            System.out.println("product price is: "+p[i].Price);
            System.out.println("product category is:"+p[i].Category);
            System.out.println("product quntity is stock is:"+p[i].QuantityinStock);
          System.out.println("invalid exception:");
          System.out.println("please enter a postive value:");
          
        }
    }
  }
  