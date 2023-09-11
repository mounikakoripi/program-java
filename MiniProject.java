/*Project Title: Online Movie Ticket Booking System

Project Description:

In this project, you will develop an Online Movie Ticket Booking System in Java. This system will allow users to browse, search for, and book movie tickets. Users can view movie details, select seats, make payments, and receive booking confirmations.

Attributes of a Movie:

Movie ID: A unique identifier for each movie (string or integer).
Title: The title of the movie (string).
Genre: The genre of the movie (string).
Release Date: The release date of the movie (date or string).
Duration: The duration of the movie in minutes (integer).
Language: The language in which the movie is available (string).
Available Seats: The number of seats available for booking (integer).

Attributes of a Booking:

Booking ID: A unique identifier for each booking (string or integer).
Movie: The movie for which the booking is made (reference to Movie).
User Name: The name of the user making the booking (string).
Number of Tickets: The number of tickets being booked (integer).
Total Amount: The total amount to be paid for the booking (double).

Operations/Methods to Implement:

Browse Movies: Display a list of available movies, including their details (title, genre, release date, duration, language, available seats).
Search for Movies: Allow users to search for movies by title, genre, release date, language, or duration.
View Movie Details: Show detailed information about a specific movie, including available seats.
Book Tickets: Allow users to select the number of tickets they want to book for a movie, choose seats, and make a booking. Update the available seats accordingly.
Make Payment: Simulate a payment process, calculate the total amount based on the number of tickets and ticket price, and generate a booking confirmation.
View Booking History: Display a history of bookings made by a user, including details of each booking.*/
import java.util.*;
class NoTicketsAvailableException extends Exception
  {
    NoTicketsAvailableException(String message)
    {
      super(message);
    }
  }
class Movie
  {
    int Movie_id,Duration,AvailableSeats;
    String Movie_Title,Movie_Genres,MovieRelease_Date,Languages;
    public Movie(int Movie_id,int Duration,int AvailableSeats,String Movie_Title,String Movie_Genres,String MovieRelease_Date,String Languages)
    {
     this.Movie_id=Movie_id;
      this.Duration=Duration;
      this.AvailableSeats=AvailableSeats;
      this.Movie_Title=Movie_Title;
      this.Movie_Genres=Movie_Genres;
      this.MovieRelease_Date=MovieRelease_Date;
      this.Languages=Languages;
    }
    public String toString()
    {
      return(Movie_id+" "+Duration+" "+AvailableSeats+" "+Movie_Title+" "+Movie_Genres+" "+MovieRelease_Date+" "+Languages);
    }
    
    
  }
class Booking
  {
    int Booking_id,NumberOfTickets;
    String Movie_name,username;
    double totalAmount;
    public Booking(int Booking_id,int NumberOfTickets,String Movie_name,String username,double totalAmount)
    {
     this.Booking_id= Booking_id;
      this.NumberOfTickets=NumberOfTickets;
      this.Movie_name=Movie_name;
      this.username=username;
      this.totalAmount=totalAmount;
    }
      public String toString()
    {
      return(Booking_id+" "+NumberOfTickets+" "+Movie_name+" "+username+" "+totalAmount);
    }
  }

class MiniProject 
  {
    
    ArrayList<Movie> movies=new ArrayList<Movie>();
    ArrayList<Booking> bookings=new ArrayList<Booking>();
    Scanner sc=new Scanner(System.in);
    public void addMovie()
    {
      int Movie_id;
      while(true)
        {
      System.out.println("enter the movie id");
       Movie_id=sc.nextInt();
          boolean isUnique=true;
      for(Movie value:movies)
        {
          if(value.Movie_id==Movie_id)
          {
            isUnique=false;
            System.out.println("movie id must be unique ");
            break;
          }
        }
          if(isUnique)
          {
            System.out.println("movie id is valid");
            break;
          }
        }
    
      sc.nextLine();
      System.out.println("enter the name of the Movie");
      String Movie_Title=sc.nextLine();
      System.out.println("enter the genre of the movie");
      String Movie_Genres=sc.nextLine();
      System.out.println("enter the movie release date");
      String MovieRelease_Date=sc.next();
       sc.nextLine();
      System.out.println("enter the languages");
      String Languages=sc.nextLine();
     
      System.out.println("enter the movie duration in hours");
      int Duration=sc.nextInt();
      System.out.println("enter the available seats in theatre");
      int AvailableSeats=sc.nextInt();
      Movie Movie1=new Movie(Movie_id,Duration,AvailableSeats,Movie_Title,Movie_Genres,MovieRelease_Date,Languages);

      movies.add(Movie1);

      System.out.println("Movie is added"); 
    } 
    public void searchforMoviebyGenre()
    {
     if(movies.size()>0)
     {
      System.out.println("enter the movie details by genre");
        String data=sc.next();
      for(Movie value:movies)
        {
         String genres=value.Movie_Genres;
          if(genres.equalsIgnoreCase(data))
          {
            System.out.println("movieid is: "+value.Movie_id);
            System.out.println("movie title is:"+value.Movie_Title);
            System.out.println("genre of the movie: "+value.Movie_Genres);
            System.out.println("movie release date is : "+value.MovieRelease_Date);
            System.out.println("languages:"+value.Languages);
            System.out.println("duration of the movie is :"+value.Duration);
            System.out.println("available of seats :"+value.AvailableSeats);
        }
        }
     }   
    else
    {
    System.out.println("the movie list is empty");
      }
    }
      public void searchforMoviebyTitle()
        {
          if(movies.size()>0)
          {
          System.out.println("enter the movie details by title");
        String data=sc.next();
      for(Movie value:movies)
        {
         String title=value.Movie_Title;
          if(title.equalsIgnoreCase(data))
          {
            System.out.println("movieid is: "+value.Movie_id);
            System.out.println("movie title is:"+value.Movie_Title);
            System.out.println("genre of the movie: "+value.Movie_Genres);
            System.out.println("movie release date is : "+value.MovieRelease_Date);
            System.out.println("languages:"+value.Languages);
            System.out.println("duration of the movie is :"+value.Duration);
            System.out.println("available of seats :"+value.AvailableSeats);
        }
        }
        }
          else
          {
           System.out.println("the movie list is empty.no movies were playing"); 
          }
        }
      public void searchforMoviebyReleaseDate()
        {
          if(movies.size()>0)
          {
          System.out.println("enter the movie details by release date in the dd/mm/yy format");
        String data=sc.next();
      for(Movie value:movies)
        {
         String releasedate=value.MovieRelease_Date;
          if(releasedate.equalsIgnoreCase(data))
          {
            System.out.println("movieid is: "+value.Movie_id);
            System.out.println("movie title is:"+value.Movie_Title);
            System.out.println("genre of the movie: "+value.Movie_Genres);
            System.out.println("movie release date is : "+value.MovieRelease_Date);
            System.out.println("languages:"+value.Languages);
            System.out.println("duration of the movie is :"+value.Duration);
            System.out.println("available of seats :"+value.AvailableSeats);
          }
        }
        }
          else
          {
           System.out.println("the movie list is empty.no movies were playing"); 
          }
        }
    public void searchforMoviebyLanguage()
        {
           if(movies.size()>0)
           {
          System.out.println("enter the movie details by language");
        String data=sc.next();
      for(Movie value:movies)
        {
         String language=value.Languages;
          if(language.equalsIgnoreCase(data))
          {
            System.out.println("movieid is: "+value.Movie_id);
            System.out.println("movie title is:"+value.Movie_Title);
            System.out.println("genre of the movie: "+value.Movie_Genres);
            System.out.println("movie release date is : "+value.MovieRelease_Date);
            System.out.println("languages:"+value.Languages);
            System.out.println("duration of the movie is :"+value.Duration);
            System.out.println("available of seats :"+value.AvailableSeats);
          }
        }
        }
          else
           {
             System.out.println("the movie list is empty.no movies were playing"); 
           }
        }
     public void addBooking()
    {
    int Booking_id;
    while(true)
    {  
      System.out.println("enter the booking id :");
      Booking_id=sc.nextInt();
       boolean isUnique=true;
      for(Booking value:bookings)
        {
          if(value.Booking_id==Booking_id)
          {
            isUnique=false;
            System.out.println("Booking id must be unique ");
            break;
          }
        }
          if(isUnique)
          {
            System.out.println("Booking id is valid");
            break;
          }
        }
      sc.nextLine();
       System.out.println("enter the name of the Movie:");
      String Movie_name=sc.nextLine();
      System.out.println("enter the user name:");
      String username=sc.nextLine();
      System.out.println("enter the no of tickets :");
      int NumberOfTickets=sc.nextInt();
      System.out.println("enter the total amount that you got in the totalpayment");
      double totalAmount=sc.nextDouble();
      
      Booking booking1=new Booking(Booking_id,NumberOfTickets,Movie_name,username,totalAmount);

      bookings.add(booking1);

      System.out.println("booking is added succesfully"); 
    }
    public void viewMovieDetails()
    {
      if(movies.size()>0)
      {
        sc.nextLine();
        System.out.println("enter the movie name to display the details");
        String title=sc.nextLine();
        for(Movie value:movies)
          {
        if(title.equalsIgnoreCase(value.Movie_Title))
        {
          System.out.println("movieid is: "+value.Movie_id);
            System.out.println("movie title is:"+value.Movie_Title);
            System.out.println("genre of the movie: "+value.Movie_Genres);
            System.out.println("movie release date is : "+value.MovieRelease_Date);
            System.out.println("languages:"+value.Languages);
            System.out.println("duration of the movie is :"+value.Duration);
            System.out.println("available of seats :"+value.AvailableSeats);
        }
      }
    }
      else
        System.out.println("no movies are  playing or in the list");
    }
public int bookTickets() throws NoTicketsAvailableException
    {
      System.out.println("enter the movie id to book tickets");
      int id=sc.nextInt();
      System.out.println("enter the how many tickets you want to book");
      int numofTickets=sc.nextInt();
      for(Movie value:movies)
        {
          if(id==value.Movie_id)
          {
            if(value.AvailableSeats<numofTickets)
            {
             throw new NoTicketsAvailableException("all tickets are booked(housefull)");
            }
            else
            {
              value.AvailableSeats=(value.AvailableSeats-numofTickets);
              System.out.println("the tickets are booked succesfully");
            } 
          }
        }
      return numofTickets;
    }
    
    public void makePayment()
    {
      if(bookings.size()>0)
      {
      System.out.println("enter the no of tickets to book");
      int book=sc.nextInt();
      int ticketPrice=177;
      int paymentToPay=book*ticketPrice;
       
      System.out.println("Total price of the "+book +"is "+paymentToPay);
      
    }
      else
      {
        System.out.println("booking should be done before the payment");
      }
    }
    public void viewBookingHistory()
    {
      if(bookings.size()>0)
      {
      System.out.println("booking history : ");
      for(Booking value:bookings)
        {
         System.out.println("booking id is : "+value.Booking_id);
          System.out.println("number of tickets are : "+value.NumberOfTickets);
          System.out.println("movie name is: "+value.Movie_name);
          System.out.println("the user name is : "+value.username);
          System.out.println("total amount is : "+value.totalAmount);
        
        }
    }
      else
      {
        System.out.println("no history is found and no tickets were booked");
      }
    }
    
   public void repeat()
    {
      Scanner sc=new Scanner(System.in);
     MiniProject mv=new MiniProject();
      do{
        System.out.println("Welcome to online Movie Ticket Booking System");
        System.out.println("1.Add movie(by admin) \n 2.Searching a movie by genre \n 3.Searching a movie by title \n 4.Searching a movie by release date\n 5.Searching a movie by language \n 6. View movie details \n  \n 7.Book tickets \n 8.make payment \n 9.Add booking (by admin) \n 10. view history.\n 11.exit ");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        switch(choice)
          {
            case 1:
              mv.addMovie();
              break;
           case 2:
              mv.searchforMoviebyGenre();
              break;
            case 3:
              mv.searchforMoviebyTitle();
              break;
              
            case 4:
              mv.searchforMoviebyReleaseDate();
              break;
            case 5:
                mv.searchforMoviebyLanguage();
                break;
            case 6:
              mv.viewMovieDetails();
              break;
            case 7:
             try
             {mv.bookTickets();}
              catch(Exception e)
               {
                 System.out.println(e);
               }
              break;
            case 8:
              mv.makePayment();
              break;
            case 9:
            mv.addBooking();
              break;
            case 10:
              mv.viewBookingHistory();
              break;
            case 11:
              System.exit(0);
              break;
            default:
              System.out.println("choose the valid option");
          }
      }while(true);
    }
    public void process()
    {
      System.out.println("choose option 1 and option 7 if you are a admin");
      System.out.println(" ");
      System.out.println("choose any options other than admin's choice if you are a user");
      System.out.println(" ");
    }
public static void main(String [] args)
  {
  MiniProject mv=new MiniProject();
    mv.process();
  mv.repeat();
  }
  }


