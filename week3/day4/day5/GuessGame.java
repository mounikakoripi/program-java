//numberGussing game
import java.util.Random;
import java.util.Scanner;
class GuessGame 
{
    public static void main(String []args)
  {
      //  Random rand = new Random();
       // int numberToGuess = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess=0;
    int number;
        boolean correct = false;
      while(!correct)
        {
            System.out.print("Guess a number between 1 and 100: ");
           number=sc.nextInt();
            guess = sc.nextInt();

            if (guess==number) 
            {
                System.out.println("Congratulations! You guessed the number!");
                correct = true;
            }
            else if (guess < number)
            {
                System.out.println("Your guess is too low. Try again.");
            }
            else {
                System.out.println("Your guess is too high. Try again.");
            }
        }
  }
}
          