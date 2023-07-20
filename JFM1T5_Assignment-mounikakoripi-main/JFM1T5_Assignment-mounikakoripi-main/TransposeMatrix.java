/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    //int a[][]=new int[3][3];
     System.out.println("enter the  number of rows:");
      int r=sc.nextInt();
      System.out.println("enter the number of colums:");
      int c=sc.nextInt();
      int a[][]=new int[r][c];
      int tran_arr[][]=new int[c][r];
    System.out.println("enter the array elements:");
    for(int i=0;i<a.length;i++)
      {
        for(int j=0;j<a.length;j++)
          {
            a[i][j]=sc.nextInt();
          }
      }
    System.out.println("the array matrix ");
    for(int i=0;i<a.length;i++)
      {
        for(int j=0;j<a.length;j++)
          {
            System.out.print(a[i][j]+" ");
          }
      }
    System.out.println();
    for(int i=0;i<tran_arr.length;i++)
      {
        for(int j=0;j<tran_arr[i].length;j++)
          {
            tran_arr[i][j]=a[i][j];         }
      }
    System.out.println("the transpose matrix is:");
    for(int i=0;i<tran_arr.length;i++)
      {
        for(int j=0;j<tran_arr.length;j++)
          {
            System.out.print(tran_arr[j][i]+" ");
          }
      }
    System.out.println();
  }

//Define the main method

//Declare the variables

//Take input from user to enter rows and column values

//Convert the square matrix into transpose

//Print the transpose matrix

//printing j and i instead of i and j

}