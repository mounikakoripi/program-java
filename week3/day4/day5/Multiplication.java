import java.util.Scanner;
 class Multiplication
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Multiplication table of " + number + ":");

        for (int i = 1; i <= 10; i++) 
        {
            if (number * i % number == 0) 
            {
                System.out.println(number + " x " + i + " = " + number * i);
            }
        }
  }
}