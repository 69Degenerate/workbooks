// Write a program to accept the two dimensional array element and display a
// transpose matrix


import java.util.*;

public class first {
  public static void main(String args[]) {
    int row, col;

    Scanner s = new Scanner(System.in);

    System.out.print("Input number of rows: ");
    row = s.nextInt();
    System.out.print("Input number of rows: ");
    col = s.nextInt();

   
    int a[][] = new int[row][col];
    System.out.println("Enter elements of matrix a:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print("Element [" + (i + 1) + "," + (j + 1) + "] ? ");
        a[i][j] = s.nextInt();
      }
    }

    //print matrix a
    System.out.println("\n :::Original Matrix:::");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(a[i][j] + "\t");
      }
      System.out.print("\n");
    }

    //print matrix b
    System.out.println("\n ::::: Transpose Matrix ::::: ");
    for (int i = 0; i < col; i++) {
      for (int j = 0; j < row; j++) {
        System.out.print(a[j][i] + "\t");
      }
      System.out.print("\n");
    }
    
  }
}
