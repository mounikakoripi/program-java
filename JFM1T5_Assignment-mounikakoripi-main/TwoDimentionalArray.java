/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray {
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of rows and colums:");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("enter the array elements:");
    for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr.length;j++)
          {
            arr[i][j]=sc.nextInt();
          }
      }
    System.out.println("the array elements are:");
    for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr.length;j++)
          {
            System.out.println(arr[i][j]);
          }
      }
    int max=arr[0][0];
     int max_r=0;
    int max_c=0;
    for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr.length;j++)
          {
            if(max<arr[i][j])
            {
              max=arr[i][j];
              max_r=i;
                max_c=j;
            }
          }
    }
    System.out.println("the largest element array is:"+max+" and its index postion is ["+max_r+"]["+max_c+"]");
  }

//Define the main method

//Declare the variables

//Take number of rows and columns from user in two-dimensional array

//assume first element is largest and use for loop to compare the largest element with all the reamaining elements

//Calcualte the maximum element based on index poistion

//Print result

}